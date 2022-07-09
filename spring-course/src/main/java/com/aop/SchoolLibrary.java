package com.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Please take your book");
    }
}
