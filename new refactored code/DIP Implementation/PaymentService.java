package com.mycompany.bookstore;

public class PaymentService {
    public void processPayments(Customer[] customers, Book[] books, PaymentProcessor processor) {
        for (int i = 0; i < customers.length; i++) {
            double amount = books[i].getPrice(); 
            processor.process(customers[i], amount);
        }
    }
}