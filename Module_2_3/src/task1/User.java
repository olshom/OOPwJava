package task1;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void borrowBook (Book book) {
        borrowedBooks.add(book);
    }
}
