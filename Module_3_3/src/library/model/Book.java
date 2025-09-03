package library.model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    boolean reserved;

    public Book (String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.reserved = false;
    }
    public String getTitle() {
        return title;
    }

    public void setReserved(boolean isReserved){
        this.reserved = isReserved;
    }

    public boolean isReserved() {
        return reserved;
    }
}
