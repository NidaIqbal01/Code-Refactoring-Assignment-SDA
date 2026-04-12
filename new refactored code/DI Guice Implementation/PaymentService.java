/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;
import com.google.inject.Inject;

class PaymentService {
    private final PaymentProcessor processor;

    @Inject // <--- Guice will now automatically provide the PayPalProcessor here
    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void processPayments(Customer[] customers, Book[] books) {
        for (int i = 0; i < customers.length; i++) {
            double amount = books[i].getPrice(); 
            processor.process(customers[i], amount);
        }
    }
}
