/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

import java.util.List;

public interface InventoryRepository {
    void addBook(Book book);
    List<Book> getAllBooks();
}
