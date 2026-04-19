package com.mycompany.bookstore;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " - $" + price;
    }
    
    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Book)) return false;

    Book other = (Book) obj;
    return title.equals(other.title) &&
           author.equals(other.author);
}

@Override
public int hashCode() {
    return title.hashCode() + author.hashCode();
}
}
