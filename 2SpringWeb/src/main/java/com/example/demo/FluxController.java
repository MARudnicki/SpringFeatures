package com.example.demo;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/*
https://www.baeldung.com/spring-webflux
 */

@RestController
@Slf4j
public class FluxController {

    @GetMapping("flux")
    public Flux<String> dtoFlux(){

        log.info("start");
        Mono<String> longer = Mono.fromSupplier(this::longerTask);
        log.info("start first");
        Mono<String> shorter = Mono.fromSupplier(this::shorter);
        log.info("start second");

        return Flux.first(Arrays.asList(shorter, longer));
    }

    @SneakyThrows
    private String longerTask(){
        TimeUnit.SECONDS.sleep(5);
        return "longer passed... ";
    }

    @SneakyThrows
    private String shorter(){
        TimeUnit.SECONDS.sleep(2);
        return "shorter passed... ";
    }

}
