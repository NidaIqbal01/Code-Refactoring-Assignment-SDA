/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online.bookstore.system;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }
@Override
public boolean pay(double amount) {
    // Admins don't pay, they manage system
    System.out.println("Admin cannot make payments.");
    return false;
}
    public void addBookToInventory(Book book) {
        // Logic for adding a book to the inventory
        System.out.println("Added " + book.getTitle() + " to inventory.");
    }
}
