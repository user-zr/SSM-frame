package com.neusoft.dao;

import com.neusoft.domain.Account;
import com.neusoft.domain.AccountUser;

import java.util.List;

public interface IAccountDao
{
    List<Account> findAll();

    List<AccountUser> findAllAccount();

}
