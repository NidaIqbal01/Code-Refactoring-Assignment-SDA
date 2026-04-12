/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;
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
                int index = Math.min(rating - 1, commentBank.size() - 1);
                String comment = commentBank.get(index);
                
                reviews.add(new Review(customer, book, comment, rating));
            }
        }
        return reviews;
    }
}
