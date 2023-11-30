package com.graduation.project.Model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Accounts")
public class Account implements Serializable {

    @Id
    String username;
    String password;
    String fullname;
    String email;
    String photo;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Order> orders;

    @JsonIgnore
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    List<Authority> authorities;
}
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;
//
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "account")
//public class Account {
//    @Id
//    @Column(name = "username", nullable = false)
//    @JdbcTypeCode(SqlTypes.VARCHAR)
//    private Long username;
//
//
//    @Column(name = "password", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.VARCHAR)
//    private String password;
//
//    @Column(name = "full_name", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.NVARCHAR)
//    private String full_name;
//
//    @Column(name = "email", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.VARCHAR)
//    private String email;
//
//    @Column(name = "activated", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.BOOLEAN)
//    private String activated;
//
//    @Column(name = "admin", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.BOOLEAN)
//    private String admin;
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "account_id")
//    private Set<Order> orders = new LinkedHashSet<>();
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "account_username")
//    private Set<Authorities> authorities = new LinkedHashSet<>();
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "account_comment")
//    private Set<Comment> comments = new LinkedHashSet<>();
//
//
//
//}