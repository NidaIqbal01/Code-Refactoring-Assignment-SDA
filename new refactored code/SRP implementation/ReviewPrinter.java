package com.mycompany.bookstore;

import java.util.List;
import java.text.DecimalFormat;

public class ReviewPrinter {

    public void printReviews(Book[] books, ReviewManager reviewManager) {
        DecimalFormat df = new DecimalFormat("#.00");

        for (Book book : books) {
            List<Review> bookReviews = reviewManager.getReviewsForBook(book);

            System.out.println("Reviews for " + book.getTitle() + ":");

            if (bookReviews.isEmpty()) {
                System.out.println("No reviews available.");
            } else {
                double total = 0;
                for (Review review : bookReviews) {
                    System.out.println(review);
                    total += review.getRating();
                }
                System.out.println("Average Rating: " + df.format(total / bookReviews.size()));
            }
            System.out.println();
        }
    }
}