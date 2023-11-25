package com.graduation.project.DAO;


import com.graduation.project.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDAO extends JpaRepository<Account, String> {

}
