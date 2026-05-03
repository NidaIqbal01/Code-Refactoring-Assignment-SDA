package com.mycompany.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements InventoryInterface {
    private List<Book> books;

    public Inventory() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
