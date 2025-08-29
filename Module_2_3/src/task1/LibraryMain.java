package task1;

public class LibraryMain {
    public static void main(String[] args) {
        task1.Book book1 = new task1.Book(1869, "Lev Tolstoy", "War and Peace");
        task1.Book book2 = new task1.Book(1954, "J.R.R. Tolkien", "The Fellowship of the Ring");
        task1.Book book3 = new task1.Book(1997, "J.K. Rowling", "Harry Potter and the Philosopher's Stone");
        task1.Library library = new task1.Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayBooks();
        library.findBooksByAuthor("Lev Tolstoy");

        library.borrowBook("War and Peace");
        library.displayBooks();
        library.returnBook(book1);
        library.displayBooks();

        System.out.println("\nIs 'The Art of Fiction' available? " + library.isBookAvailable("The Art of Fiction"));

        book1.setRating(4.6);
        book2.setRating(4.5);
        book3.setRating(4.7);

        book2.addReview("Great book");
        book2.addReview("Good book");
        book1.addReview("Review");


        System.out.printf("\nAverage rating: %.2f \n", library.getAverageBookRating());

        System.out.println("The most reviewed book is \""+ library.getMostReviewedBook().getTitle() + "\"");
    }
}
