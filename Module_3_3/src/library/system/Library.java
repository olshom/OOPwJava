package library.system;

import library.model.*;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(LibraryMember user) {
        users.add(user);
    }

    public void borrowBook(Book book, LibraryMember user) {
        if (books.contains(book)) {
            user.borrowBook(book);
            books.remove(book);
            System.out.println(user.getName() + " borrowed the book " + book.getTitle());
        }
        else {
            System.out.println("There is no such book in the library");
        }
    }
    public void returnBook (Book book, LibraryMember user){
        if (user.getUsersBooks().contains(book)) {
            user.returnBook(book);
            books.add(book);
            System.out.println(user.getName() + " returned the book " + book.getTitle());
        } else {
            System.out.println(user.getName() + " does not have this book.");
        }
    }
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}

