package com.mycompany.bookstore;

interface PaymentProcessor {
    boolean process(Customer customer, double amount);
}

// Concrete Implementations
class CreditCardProcessor implements PaymentProcessor {
    public boolean process(Customer customer, double amount) {
        System.out.println("Charging Credit Card for " + customer.getUsername());
        return true;
    }
}

// The Service (Closed for Modification)
public class PaymentService {
    public void processPayments(Customer[] customers, Book[] books, PaymentProcessor processor) {
        for (int i = 0; i < customers.length; i++) {
            double amount = books[i].getPrice(); 
            processor.process(customers[i], amount);
        }
    }
}

