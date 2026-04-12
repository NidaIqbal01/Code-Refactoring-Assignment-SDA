/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

import java.util.ArrayList;
import java.util.List;

// DIP: Implements the abstraction
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
