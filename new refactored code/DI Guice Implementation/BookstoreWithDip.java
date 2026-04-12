/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookstore.with.dip;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class BookstoreWithDip {

    public static void main(String[] args) {
  
        // 1. Initialize the Guice "Brain" with our Recipe Book
    Injector injector = Guice.createInjector(new BookstoreModule());

    // 2. Instead of "new InventoryService(new Inventory())", just do this:
    InventoryService inventoryService = injector.getInstance(InventoryService.class);
    
    // 3. Instead of "new PaymentService(new PayPalProcessor())", just do this:
    PaymentService paymentService = injector.getInstance(PaymentService.class);
        
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
            orders[i] = orderService.createOrder(customers[i], books, i, new SimpleOrderStrategy());
            orderPrinter.printOrder(orders[i]);
        }

        // --- STEP 3: REVIEWS ---
        ReviewService reviewService = new ReviewService(Arrays.asList(
            "Terrible! Do not get!", 
            "Not that great...",    
            "Good.",               
            "Really good!",         
            "Highly recommend!"     
        ));
        List<Review> reviews = reviewService.generateRandomReviews(customers, books);
        
        // DIP: Depending on abstraction (ReviewProvider)
        ReviewProvider reviewManager = new ReviewManager(reviews);
        ReviewPrinter reviewPrinter = new ReviewPrinter();

        reviewPrinter.printReviews(books, reviewManager);
        
        paymentService.processPayments(customers, books);
    }
}