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

    public void removeBooks() {
        this.books = null;
    }
}
