package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book newBook = new Book();
//        System.out.println(newBook);

        Library library1 = new Library();
        library1.setLibraryName("library1");
        library1.setLibraryId(1);
        Book[] books = library1.getBooks();

        System.out.println(library1);

        Book book1 = new Book();
        book1.setAuthor("book1");
        book1.setIsbn(123);

        Book book2 = new Book();
        book2.setAuthor("book2");
        book2.setIsbn(321);

        // TODO: Look for better way to add objects in one array
        Book[] booksAsArray = new Book[2];

        booksAsArray[0] = book1;
        booksAsArray[1] = book2;

        library1.setBooks(booksAsArray);

        for (Book book : library1.getBooks()) {
            System.out.println("Book" + book);
        }

        System.out.println("Remove all books from library");
        library1.removeBooks();
        System.out.println(library1.getBooks());
    }
}