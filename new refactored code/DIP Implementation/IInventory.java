package com.mycompany.bookstore;

import java.util.List;

public interface IInventory {
    void addBook(Book book);
    List<Book> getAllBooks();
}