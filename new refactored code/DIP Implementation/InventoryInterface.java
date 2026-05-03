package com.mycompany.bookstore;

import java.util.List;

public interface InventoryInterface {
    void addBook(Book book);
    List<Book> getAllBooks();
}
