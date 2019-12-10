package com.example.demo;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.netty.http.server.HttpServerRequest;

@RestController
public class MyController {

    @RequestMapping("add")
    public Integer add(int a, int b) {

        return a+b;
    }

    @GetMapping("subtract/{a}/{b}")
    public Integer subtract(@RequestParam int a, @RequestParam int b){

        return a+b;
    }

    @GetMapping("body")
    public Dto third(@RequestBody Dto dto){

        return Dto.create("third");
    }

}
