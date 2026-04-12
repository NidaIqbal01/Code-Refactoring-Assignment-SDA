/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

public class PaymentService {
    public void processPayments(Customer[] customers, Book[] books, PaymentProcessor processor) {
        for (int i = 0; i < customers.length; i++) {
            double amount = books[i].getPrice(); 
            processor.process(customers[i], amount);
        }
    }
}
