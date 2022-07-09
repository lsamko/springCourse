package com.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Take a book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("Return book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Take a magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Return magazine to UniLibrary");
    }

    public void addBook() {
        System.out.println("Add a book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Add magazine to UniLibrary");
    }
}
