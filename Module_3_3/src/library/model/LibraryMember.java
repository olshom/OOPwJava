package library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private static int totalUsers = 0;
    private String name;
    private int id;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        totalUsers++;
        this.name = name;
        this.id = totalUsers;
    }

    public String getName() {
        return this.name;
    }
    public ArrayList<Book> getUsersBooks(){
        return this.borrowedBooks;
    }
    public void borrowBook (Book book) {
        borrowedBooks.add(book);
    }
    public void returnBook (Book book) {
        borrowedBooks.remove(book);
    }
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
