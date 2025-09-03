package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryMember user1 = new LibraryMember("Iron Man");
        LibraryMember user2 = new LibraryMember("Capitan America");
        library.addUser(user1);
        library.addUser(user2);

        Book book1 = new Book( "War and Peace","Lev Tolstoy", "04536534");
        Book book2 = new Book( "The Fellowship of the Ring","J.R.R. Tolkien", "34567675");
        Book book3 = new Book("Harry Potter and the Philosopher's Stone","J.K. Rowling","345476" );
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.borrowBook(book1, user1);
        library.borrowBook(book2, user1);
        library.borrowBook(book3, user2);
        library.borrowBook(book3, user2);
        System.out.println(" ");

        library.returnBook(book2, user1);
        library.returnBook(book2, user2);
        library.returnBook(book1, user1);
        System.out.println(" ");

        library.reserveBook(user2,book2);
        library.reserveBook(user1,book1);
        library.displayReservedBooks(user1);
        library.displayReservedBooks(user2);
        library.cancelReservation(user1,book1);
        library.displayReservedBooks(user1);



    }
}
