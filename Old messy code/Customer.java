/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online.bookstore.system;

public class Customer extends User {
    private String email;

    public Customer(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
@Override
    public boolean pay(double amount) {
        System.out.println(getUsername() + " paid $" + amount);
        return true;

    }
    public void purchaseBook(Book book) {
        // Logic for purchasing a book
        System.out.println(getUsername() + " purchased " + book.getTitle());
    }
}

