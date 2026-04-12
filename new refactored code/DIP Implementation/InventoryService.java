/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

public class InventoryService {
    // DIP: Depends on the interface instead of the concrete Inventory
    private final InventoryRepository inventory;

    public InventoryService(InventoryRepository inventory) {
        this.inventory = inventory;
    }

    public void addBooks(Book[] books) {
        for (Book book : books) {
            inventory.addBook(book);
        }
    }
}
