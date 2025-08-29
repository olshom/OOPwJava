package task1;
import java.util.ArrayList;

public class Library {
    private ArrayList<task1.Book> books = new ArrayList<>();

    public void addBook(task1.Book book) {
        books.add(book);
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

    public void borrowBook(String title) {
        for (task1.Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return;
            }
        }
    }

    public void returnBook(task1.Book book) {
        addBook(book);
        System.out.println(book.getTitle() + " was returned");
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
