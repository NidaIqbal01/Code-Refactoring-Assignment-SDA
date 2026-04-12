/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online.bookstore.system;
public class Payment {
    public static boolean processPayment(Customer customer, double amount) {
        // Logic for processing a payment
        System.out.println("Processed payment of $" + String.format("%.2f", amount) + " for " + customer.getUsername());
        return true;
    }
}
