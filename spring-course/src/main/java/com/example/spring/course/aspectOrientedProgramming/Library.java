package com.example.spring.course.aspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("Please get your book");
    }
}
