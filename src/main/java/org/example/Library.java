package org.example;

import java.util.Arrays;

public class Library {

    String libraryName;
    int LibraryId;

    Book[] books;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Book[] getBooks() {
        Book book1 = new Book();
        book1.setAuthor("book1");
        book1.setIsbn(123);

        Book book2 = new Book();
        book2.setAuthor("book2");
        book2.setIsbn(321);

        // TODO: Look for better way to add objects in one array
        Book[] books = new Book[2];

        books[0] = book1;
        books[1] = book2;

        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getLibraryId() {
        return LibraryId;
    }

    public void setLibraryId(int libraryId) {
        LibraryId = libraryId;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", LibraryId=" + LibraryId +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
