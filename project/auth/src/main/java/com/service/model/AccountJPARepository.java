package main.java.com.service.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountJPARepository implements IAccountRepository {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public Account get(String cpf, String password) {
        return accountDAO.get(cpf, password);
    }
}