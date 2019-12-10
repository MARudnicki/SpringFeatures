package com.example.demo;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface AccountDao extends CrudRepository<Account, Long> {

//    Optional<Account> findByCreationTimeBeforeAndAndBooksAndName(LocalDateTime localDateTime, String bookName);

}
