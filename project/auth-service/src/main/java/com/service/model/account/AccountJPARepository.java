package com.service.model.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountJPARepository implements IAccountRepository {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public Account get(String cpf) {
        return accountDAO.findById(cpf).get();
    }

}
