/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

public class Customer extends User {
    private String email;

    public Customer(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
