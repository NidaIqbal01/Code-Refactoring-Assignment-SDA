/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

class PayPalProcessor implements PaymentProcessor {
    @Override
    public boolean process(Customer customer, double amount) {
        System.out.println("Redirecting " + customer.getUsername() + " to PayPal gateway...");
        System.out.println("Payment of $" + amount + " authorized via PayPal.");
        return true;
    }
}
