package task1;

import java.util.ArrayList;

public class Book {
    private int publicationYear;
    private String author;
    private String title;
    private double rating;
    public ArrayList<String> reviews = new ArrayList<>();

    public Book (int publicationYear, String author, String title) {
        this.publicationYear = publicationYear;
        this.author = author;
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review){
        reviews.add(review);
    }
    public ArrayList<String> getReviews() {
        return reviews;
    }
}
