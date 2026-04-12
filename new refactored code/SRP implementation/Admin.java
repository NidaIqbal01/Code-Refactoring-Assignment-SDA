/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void addBookToInventory(Book book) {
        // Logic for adding a book to the inventory
        System.out.println("Added " + book.getTitle() + " to inventory.");
    }
}