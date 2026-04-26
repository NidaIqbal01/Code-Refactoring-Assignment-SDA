package com.mycompany.bookstore;

import java.util.ArrayList;
import java.util.List;

public class ReviewManager implements ReviewProvider {
    private List<Review> reviews;

    public ReviewManager(List<Review> reviews) {
        this.reviews = new ArrayList<>(reviews);
    }

    @Override
    public List<Review> getReviewsForBook(Book book) {
        List<Review> bookReviews = new ArrayList<>();
        for (Review review : reviews) {
            if (review.getBook().equals(book)) {
                bookReviews.add(review);
            }
        }
        return bookReviews;
    }
}