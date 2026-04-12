/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online.bookstore.system;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Book> purchasedBooks = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addBookToOrder(Book book) {
        purchasedBooks.add(book);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Book book : purchasedBooks) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

    public void completeOrder() {
        System.out.println("Order for " + customer.getUsername() + " is complete.");
        System.out.println("Books purchased:");
        for (Book book : purchasedBooks) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " ($" + String.format("%.2f", book.getPrice()) + ")");
        }
        System.out.println("Total: $" + String.format("%.2f", getTotalPrice()));
        System.out.println();
    }
}
