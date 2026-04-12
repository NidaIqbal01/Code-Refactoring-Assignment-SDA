
package com.mycompany.bookstore;

public class OrderService {

    private OrderPrinter printer = new OrderPrinter();

    public Order[] createOrders(Customer[] customers, Book[] books) {
        System.out.println("\nSimulating purchases and orders...");

        Order[] orders = new Order[customers.length];

        for (int i = 0; i < customers.length; i++) {
            Order order = new Order(customers[i]);

            order.addBookToOrder(books[i * 2]);
            order.addBookToOrder(books[i * 2 + 1]);

            order.completeOrder();        
            printer.printOrder(order);    

            orders[i] = order;
        }

        return orders;
    }
}
