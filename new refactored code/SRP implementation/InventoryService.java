package com.mycompany.bookstore;

public class InventoryService {
    private Inventory inventory;

    public InventoryService(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addBooks(Admin admin, Book[] books) {
        System.out.println("Adding books to inventory...");
        for (Book book : books) {
            admin.addBookToInventory(book);
            inventory.addBook(book);
        }
    }
}
