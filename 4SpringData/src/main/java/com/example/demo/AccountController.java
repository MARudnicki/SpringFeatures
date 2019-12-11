package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountController {

    private final AccountsDao accountsDao;

    @GetMapping("aaa")
    public Object firstQuery(){
        return accountsDao
                .findById(1L);
    }

    @GetMapping("bbb")
    public Object secondQuery(){
        return accountsDao
                .findByAgeGreaterThanAndNameStartingWith(1, "Bob");
    }

    @GetMapping("ccc")
    public Object thirdQuery(){
        return accountsDao
                .findByBooksTitle("AAA");
    }

    @GetMapping("ddd")
    public Object fourthQuery(){

        return accountsDao
                .findAll(Example.of(Account.builder()
                        .age(50)
                        .build()));
    }
}
