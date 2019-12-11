package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BasicController {

    @RequestMapping("add")
    public Integer add(int a,
                       int b,
                       @RequestHeader("User-Agent") String userAgentHeader) {
        log.info("User agent is {}", userAgentHeader);

        return a + b;
    }

    @GetMapping("subtract/{a}/{b}")
    public Integer subtract(@PathVariable int a, @PathVariable int b) {

        return a - b;
    }

    @PostMapping("body")
    public Dto third(@RequestBody Dto dto) {

        return Dto.create("third");
    }

}
