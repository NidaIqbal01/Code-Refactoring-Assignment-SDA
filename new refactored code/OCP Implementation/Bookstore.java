package com.mycompany.bookstore;

import java.text.DecimalFormat;
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

       inventoryService.addBooks(books);

       // A. Review Service
       PaymentService paymentService = new PaymentService();
       paymentService.processPayments(customers, books, new CreditCardProcessor());

        // B. Review Service
        ReviewService reviewService = new ReviewService(Arrays.asList("Good", "Great!"));
        List<Review> reviews = reviewService.generateRandomReviews(customers, books);
        ReviewManager reviewManager = new ReviewManager(reviews);

        // C. Ordering Strategy 
         OrderService orderService = new OrderService();
        Order[] orders = new Order[customers.length];
        for(int i=0; i<customers.length; i++) 
        {
            orders[i] = orderService.createOrder(customers[i], books, i, new SimpleOrderStrategy());
        }

        // 3. Output
        ReviewPrinter reviewPrinter = new ReviewPrinter();
        OrderPrinter orderPrinter = new OrderPrinter();

        System.out.println("--- Store Report ---");
        reviewPrinter.printReviews(books, reviewManager);
        
        for(Order order : orders) {
            orderPrinter.printOrder(order);
        }
    }
}
