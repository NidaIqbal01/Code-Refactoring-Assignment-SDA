/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;
import com.google.inject.Inject;

class InventoryService {
    private final InventoryRepository inventory;

    @Inject // 
    public InventoryService(InventoryRepository inventory) {
        this.inventory = inventory;
    }

    public void addBooks(Book[] books) {
        for (Book book : books) {
            inventory.addBook(book);
        }
    }
}
