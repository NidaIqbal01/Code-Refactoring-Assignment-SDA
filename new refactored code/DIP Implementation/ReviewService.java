package com.mycompany.bookstore;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Random;

public class ReviewService {
    private final List<String> commentBank;

    public ReviewService(List<String> comments) {
        this.commentBank = comments;
    }

    public List<Review> generateRandomReviews(Customer[] customers, Book[] books) {
        List<Review> reviews = new ArrayList<>();
        Random random = new Random();

        for (Customer customer : customers) {
            for (Book book : books) {
                int rating = random.nextInt(5) + 1;
                
                String comment = commentBank.get(random.nextInt(commentBank.size()));
                reviews.add(new Review(customer, book, comment, rating));
            }
        }
        return reviews;
    }
}