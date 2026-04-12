/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

interface OrderSelectionStrategy {
    void selectBooks(Order order, Book[] availableBooks, int index);
}
