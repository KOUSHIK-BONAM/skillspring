package com.library.service;

import com.library.repository.Ex2BookRepo;

public class Ex2BookService {

    private Ex2BookRepo bookRepo;

    public void setBookRepo(Ex2BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void serviceMethod() {
        System.out.println("Exercise 2: Book Service Started");
        bookRepo.showBook();
    }
}