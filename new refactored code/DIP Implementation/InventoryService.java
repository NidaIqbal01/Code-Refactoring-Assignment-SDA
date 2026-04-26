package com.mycompany.bookstore;

public class InventoryService {
    private final IInventory inventory;

    public InventoryService(IInventory inventory) {
        this.inventory = inventory;
    }

    public void addBooks(Book[] books) {
        for (Book book : books) {
            inventory.addBook(book);
        }
    }
}