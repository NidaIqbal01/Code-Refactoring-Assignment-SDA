package com.mycompany.bookstore;

import java.util.Arrays;
import java.util.List;

public class Bookstore {

    public static void main(String[] args) {

        Inventory inventory = new Inventory(); 
        InventoryService inventoryService = new InventoryService(inventory);
        
        Customer[] customers = {
            new Customer("user1", "user123", "user1@example.com"),
            new Customer("user2", "user456", "user2@example.com"),
            new Customer("user3", "user789", "user3@example.com")
        };
        
        Book[] books = {
            new Book("Java Programming", "John Doe", 29.99),
            new Book("Python for Beginners", "Jane Smith", 19.99),
            new Book("C++ Programming", "Alice Johnson", 34.99),
            new Book("Data Structures in Java", "Bob Wilson", 27.99),
            new Book("JavaScript Fundamentals", "Mary Brown", 24.99),
            new Book("SQL Essentials", "David Davis", 22.99),
            new Book("Algorithms and Complexity", "Eva Evans", 39.99),
            new Book("Web Development with React", "Frank Lee", 29.99),
            new Book("Artificial Intelligence", "Grace Adams", 44.99),
            new Book("Machine Learning Basics", "Henry Harris", 36.99)
        };

        System.out.println("Adding books to inventory...");
        inventoryService.addBooks(books);
        System.out.println();

        System.out.println("Simulating purchases and orders...");
        OrderService orderService = new OrderService();
        OrderPrinter orderPrinter = new OrderPrinter();
        Order[] orders = new Order[customers.length];
        
        for(int i = 0; i < customers.length; i++) {
            // DIP Fix: Injecting StandardPricing here
            orders[i] = orderService.createOrder(customers[i], books, i, new SimpleOrderStrategy(), new StandardPricing());
            orderPrinter.printOrder(orders[i]);
        }

        ReviewService reviewService = new ReviewService(Arrays.asList(
            "Terrible! Do not get!", 
            "Not that great...",     
            "Good.",                 
            "Really good!",          
            "Highly recommend!"      
        ));
        
        List<Review> reviews = reviewService.generateRandomReviews(customers, books);
        ReviewManager reviewManager = new ReviewManager(reviews);
        ReviewPrinter reviewPrinter = new ReviewPrinter();

        // DIP Fix: passing the interface implementation
        reviewPrinter.printReviews(books, reviewManager);

        PaymentService paymentService = new PaymentService();
        paymentService.processPayments(customers, books, new CreditCardProcessor());
        paymentService.processPayments(customers, books, new PayPalProcessor());
    }
}