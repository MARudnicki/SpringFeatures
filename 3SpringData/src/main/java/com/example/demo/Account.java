package com.example.demo;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDateTime creationTime;

    @OneToMany(mappedBy = "account")
    private Set<Book> books;
}
