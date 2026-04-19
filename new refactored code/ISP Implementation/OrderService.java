package com.mycompany.bookstore;

public class OrderService {
    // SRP: Only handles the lifecycle of an order
    public Order createOrder(Customer customer, Book[] books, int index, OrderSelectionStrategy selection) {
        Order order = new Order(customer, new StandardPricing());
        selection.selectBooks(order, books, index);
        order.completeOrder();
        return order;
    }
}

// This allows you to add new selection rules without touching OrderService
class SimpleOrderStrategy implements OrderSelectionStrategy {
    @Override
    public void selectBooks(Order order, Book[] availableBooks, int index) {
        // Logic: Buy the book at the current index and the next one
        if (index * 2 + 1 < availableBooks.length) {
            order.addBookToOrder(availableBooks[index * 2]);
            order.addBookToOrder(availableBooks[index * 2 + 1]);
        }
    }
}
