/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;
import java.util.List;
import java.text.DecimalFormat;

public class ReviewPrinter {

    // DIP: Depends on the interface (ReviewProvider) instead of the concrete ReviewManager
    public void printReviews(Book[] books, ReviewProvider reviewProvider) {
        DecimalFormat df = new DecimalFormat("#.00");

        for (Book book : books) {
            List<Review> bookReviews = reviewProvider.getReviewsForBook(book);

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
