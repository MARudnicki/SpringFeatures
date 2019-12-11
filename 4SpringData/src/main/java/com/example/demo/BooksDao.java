package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface BooksDao extends CrudRepository<Book, Long> {
}
