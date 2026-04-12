/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;
public class OrderService {
    public Order createOrder(Customer customer, Book[] books, int index, OrderSelectionStrategy selection) {
        Order order = new Order(customer, new StandardPricing());
        selection.selectBooks(order, books, index);
        order.completeOrder();
        return order;
    }
}
