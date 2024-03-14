package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("title1", "author1", 123, 123),
                new Book("title2", "author2", 321, 321)
        };

        Library library = new Library();
        library.setBooks(books);
//        System.out.println(library);

        // Add new book
        Book NewBook = new Book("title3", "author3", 456, 789);
        library.addBook(NewBook);
        System.out.println("Added Book");
        System.out.println(library);

//        System.out.println(books);
    }
}