package main.java.com.service.model;

public interface IAccountRepository {

    Account get(String id, String password);

}