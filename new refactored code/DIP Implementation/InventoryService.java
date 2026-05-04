package com.mycompany.bookstore;

public class InventoryService{
    private final InventoryInterface inventory;

    public InventoryService(InventoryInterface inventory) {
        this.inventory = inventory;
    }

    public void addBooks(Book[] books) {
        for (Book book : books) {
            inventory.addBook(book);
        }
    }
}
