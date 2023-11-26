package com.graduation.project;

import com.graduation.project.Model.Account;
import com.graduation.project.Service.AccountService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Configuration

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    AccountService accountService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(username -> {
                try {
                    Account user = accountService.findById(username);
                    String password = bCryptPasswordEncoder.encode(user.getPassword());
                    String[] roles = user.getAuthorities().stream()
                            .map(er -> er.getRole().getId())
                            .collect(Collectors.toList()).toArray(new String[0]);
                    return User.withUsername(username).password(password).roles(roles).build();
                } catch (NoSuchElementException e) {
                    throw new UsernameNotFoundException(username + " not found");
                }
            });
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception{
            http.csrf().disable();
            http.authorizeRequests()
                    .antMatchers("/user/order/**").authenticated()
                    .antMatchers("/admin/**").hasAnyRole("ADMIN")
                    .antMatchers("/rest/authorities").hasRole("ADMIN")
                    .anyRequest().permitAll();
            http.formLogin()
                    .loginPage("/user/security/login/form")
                    .loginProcessingUrl("/user/security/login")
                    .defaultSuccessUrl("/user/security/login/success", false)
                    .failureUrl("/user/security/login/error");

            http.rememberMe()
                    .tokenValiditySeconds(86400);

            http.exceptionHandling()
                    .accessDeniedPage("/user/security/unauthoried");

            http.logout()
                    .logoutUrl("/user/security/logoff")
                    .logoutSuccessUrl("/user/security/logoff/success");
        }
//    @Bean
//    public BCryptPasswordEncoder getPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
//    }


        }






