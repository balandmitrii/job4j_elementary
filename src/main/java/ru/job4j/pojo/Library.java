package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Capital", 545);
        Book book2 = new Book("Clean code", 12431);
        Book book3 = new Book("Lenin in october", 371);
        Book book4 = new Book("Kolobok", 14);
        Book[] books = {book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + books[i].getName() + ", total pages:"
                    + " " + books[i].getPages());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Book: " + books[i].getName() + ", total pages:"
                        + " " + books[i].getPages());
            }
        }
    }
}
