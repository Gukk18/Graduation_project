package com.graduation.project.Service.impl;

import com.graduation.project.DAO.AccountDAO;
import com.graduation.project.Model.Account;
import com.graduation.project.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO accountDAO;


    @Override
    public Account findById(String username) {
        return accountDAO.findById(username).get();
    }
}
