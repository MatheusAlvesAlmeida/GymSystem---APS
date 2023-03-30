package com.service.model.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountCollection {

    @Autowired
    private IAccountRepository repository;

    public Account get(String cpf) {
        return repository.get(cpf);
    }

}
