package task1;
import java.util.ArrayList;

public class Library {
    private ArrayList<task1.Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(task1.Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            task1.Book book = books.get(i);
            System.out.println((i + 1) + ". Titlle: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author " + author + "\":");
        for (task1.Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle() + ", Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(String title, String userName) {
        for (User user: users) {
            if (user.getName().equals(userName)) {
                for (task1.Book book : books) {
                    if (book.getTitle().equals(title)) {
                        user.borrowBook(book);
                        books.remove(book);
                        System.out.println(user.getName() + " borrowed the book " + book.getTitle());
                        return;
                    }
                }
            }
        }
    }

    public void returnBook(task1.Book book, String userName) {
        for (User user: users) {
            if (user.getName().equals(userName)) {
                addBook(book);
                user.borrowedBooks.remove(book);
                System.out.println(book.getTitle() + " was returned");
                return;
            } else {
                System.out.println("User " + userName + " not founded");
            }
        }
    }

    public boolean isBookAvailable(String title) {
        for (task1.Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating(){
        if (books.isEmpty()) return 0.0;
        double summa = 0.0;
        for (task1.Book book : books) {
            summa += book.getRating();
        }
        return (summa/books.size());
    }

    public task1.Book getMostReviewedBook() {
        if (books.isEmpty()) return null;
        task1.Book mostReviewedBook = books.get(0);
        for (task1.Book book : books) {
            if (book.getReviews().size()>mostReviewedBook.getReviews().size()) {
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }
}
