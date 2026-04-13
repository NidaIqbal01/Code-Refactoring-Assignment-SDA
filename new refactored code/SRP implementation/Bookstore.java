package com.mycompany.bookstore;

import java.util.List;

public class Bookstore {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Admin admin = new Admin("admin", "admin123");

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

        InventoryService inventoryService = new InventoryService(inventory);
        OrderService orderService = new OrderService();
        ReviewService reviewService = new ReviewService();
        ReviewPrinter reviewPrinter = new ReviewPrinter();
        PaymentService paymentService = new PaymentService();


        // Inventory
        inventoryService.addBooks(admin, books);

        // Orders
        Order[] orders = orderService.createOrders(customers, books);

        // Reviews
        List<Review> reviews = reviewService.generateRandomReviews(customers, books);
        ReviewManager reviewManager = new ReviewManager(reviews);
        reviewPrinter.printReviews(books, reviewManager);

        // Payments
        paymentService.processPayments(customers, books);
    }
}
