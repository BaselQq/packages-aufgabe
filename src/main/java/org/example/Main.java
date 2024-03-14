package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book newBook = new Book();
//        System.out.println(newBook);

        Library library1 = new Library();
        Book[] books = library1.getBooks();

        for (Book book : books) {
            System.out.println("All Books are" + book);
        }

    }
}