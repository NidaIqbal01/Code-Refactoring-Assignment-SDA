package com.mycompany.bookstore;

public class InventoryService extends Inventory{
    private final Inventory inventory;

    public InventoryService(Inventory inventory) {
        this.inventory = inventory;
  }

public void addBooks(Book[] books) {
        for (Book book : books) {
            inventory.addBook(book);
        }
    }
}
