package main.java.com.service.model;

import org.springframework.data.repository.CrudRepository;

public interface AccountDAO extends CrudRepository<Account, String> {
}