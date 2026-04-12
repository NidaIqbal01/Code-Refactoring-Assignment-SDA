package com.mycompany.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Book> purchasedBooks = new ArrayList<>();
    private String status = "PENDING"; // NEW: order state

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addBookToOrder(Book book) {
        purchasedBooks.add(book);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Book book : purchasedBooks) {
            total += book.getPrice();
        }
        return total;
    }

    public void completeOrder() {
        this.status = "COMPLETED"; // Business logic (state change)
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

    public String getStatus() {
        return status;
    }
}
