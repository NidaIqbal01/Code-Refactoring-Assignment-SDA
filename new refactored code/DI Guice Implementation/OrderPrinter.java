/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

public class OrderPrinter {

    public void printOrder(Order order) {
        System.out.println("Order for " + order.getCustomer().getUsername() + " is " + order.getStatus() + ".");
        System.out.println("Books purchased:");

        for (Book book : order.getPurchasedBooks()) {
            System.out.println("- " + book.getTitle() + " by "
                    + book.getAuthor() + " ($"
                    + String.format("%.2f", book.getPrice()) + ")");
        }

        System.out.println("Total: $"
                + String.format("%.2f", order.getTotalPrice()));

        System.out.println();
    }
}
