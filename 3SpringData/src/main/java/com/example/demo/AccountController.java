package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountController {

    private final AccountDao accountDao;

    @GetMapping("/account")
    public Account account(){
        return accountDao
                .findById(1L)
                .orElseThrow(()->new RuntimeException("Not found"));
    }

}
