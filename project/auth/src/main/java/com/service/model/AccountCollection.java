package main.java.com.service.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountCollection {

    @Autowired
    private IAccountRepository repository;

    public Account get(String cpf, String password) {
        return repository.get(cpf, password);
    }
}