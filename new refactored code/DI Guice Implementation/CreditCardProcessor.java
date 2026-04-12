/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

class CreditCardProcessor implements PaymentProcessor {
    public boolean process(Customer customer, double amount) {
        System.out.println("Charging Credit Card for " + customer.getUsername());
        return true;
    }
}
