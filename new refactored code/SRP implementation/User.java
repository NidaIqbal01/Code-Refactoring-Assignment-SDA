package com.mycompany.bookstore;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
public boolean pay(double amount) {
        System.out.println(username + " paid $" + amount);
        return true;
    }
    public String getUsername() {
        return username;
    }
}
