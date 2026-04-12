/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

public class Review {
    private Customer reviewer;
    private Book book;
    private String comment;
    private int rating;

    public Review(Customer reviewer, Book book, String comment, int rating) {
        this.reviewer = reviewer;
        this.book = book;
        this.comment = comment;
        this.rating = rating;
    }

    public Book getBook() {
        return book;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Review by " + reviewer.getUsername() + " for " + book.getTitle() + ": " + comment + " (Rating: " + rating + "/5)";
    }
}
