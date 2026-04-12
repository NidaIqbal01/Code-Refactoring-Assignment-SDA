package com.mycompany.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private final List<Book> purchasedBooks = new ArrayList<>();
    private final PricingStrategy pricingStrategy;
    private String status = "PENDING";

    public Order(Customer customer, PricingStrategy pricingStrategy) {
        this.customer = customer;
        this.pricingStrategy = pricingStrategy;
    }

    public void addBookToOrder(Book book) { purchasedBooks.add(book); }
    public void completeOrder() { this.status = "COMPLETED"; }
    
    // SRP: Delegation
    public double getTotalPrice() {
        return pricingStrategy.calculate(purchasedBooks);
    }
    
    public Customer getCustomer() { return customer; }
    public List<Book> getPurchasedBooks() { return purchasedBooks; }
    public String getStatus() { return status; }
}



