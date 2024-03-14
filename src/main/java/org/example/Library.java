package org.example;

import java.util.Arrays;

public class Library {

    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void removeBooks() {
        this.books = null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book book) {
        Book[] newBooks = Arrays.copyOf(books,books.length+1);
        newBooks[newBooks.length-1] = book;
        books = newBooks;
    }
}
