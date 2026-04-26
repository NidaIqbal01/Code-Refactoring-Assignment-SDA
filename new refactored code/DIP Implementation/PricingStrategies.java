package com.mycompany.bookstore;

import java.util.List;

interface PricingStrategy {
    double calculate(List<Book> books);
}

class StandardPricing implements PricingStrategy {
    public double calculate(List<Book> books) {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }
}