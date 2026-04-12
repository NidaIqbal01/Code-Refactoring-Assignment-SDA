package com.mycompany.bookstore;

import java.text.DecimalFormat;
import java.util.*;

public class ReviewService {

    public List<Review> generateRandomReviews(Customer[] customers, Book[] books) {
        List<Review> reviews = new ArrayList<>();
        Random random = new Random();

        String[] comments = {
            "Terrible! Do not get!",
            "Not that great...",
            "Good.",
            "Really good!",
            "Highly recommend!"
        };

        for (Customer customer : customers) {
            for (Book book : books) {
                int rating = random.nextInt(5) + 1;
                reviews.add(new Review(customer, book, comments[rating - 1], rating));
            }
        }

        return reviews;
    }
}