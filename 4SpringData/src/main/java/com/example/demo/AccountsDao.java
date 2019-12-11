package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.repository.CrudRepository;

public interface AccountsDao extends CrudRepository<Account, Long> {

    List<Account> findByAgeGreaterThanAndNameStartingWith(int age, String name);

    List<Account> findByBooksTitle(String title);

    List<Account> findAll(Example<Account> accountExample);

}
