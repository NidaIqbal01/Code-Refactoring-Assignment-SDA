/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

class SimpleOrderStrategy implements OrderSelectionStrategy {
    @Override
    public void selectBooks(Order order, Book[] availableBooks, int index) {
        if (index * 2 + 1 < availableBooks.length) {
            order.addBookToOrder(availableBooks[index * 2]);
            order.addBookToOrder(availableBooks[index * 2 + 1]);
        }
    }
}
