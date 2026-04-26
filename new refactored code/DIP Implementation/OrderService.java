package com.mycompany.bookstore;

public class OrderService {
    public Order createOrder(Customer customer, Book[] books, int index, 
                             OrderSelectionStrategy selection, PricingStrategy pricingStrategy) {
        Order order = new Order(customer, pricingStrategy);
        selection.selectBooks(order, books, index);
        order.completeOrder();
        return order;
    }
}