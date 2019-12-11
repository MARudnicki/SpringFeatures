package com.example.demo;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SpringDataApplication implements CommandLineRunner {

    private AccountsDao accountsDao;
    private BooksDao booksDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Account bob = Account.builder()
                .age(12)
                .name("Bob")
                .build();

        Account john = Account.builder()
                .age(50)
                .name("John")
                .build();

        accountsDao.saveAll(Arrays.asList(bob, john));

        Book book1 = Book.builder()
                .account(bob)
                .title("AAA")
                .build();

        Book book2 = Book.builder()
                .account(bob)
                .title("BBB")
                .build();

        Book book3 = Book.builder()
                .account(john)
                .title("CCC")
                .build();

        booksDao.saveAll(Arrays.asList(book1, book2, book3));
    }
}
