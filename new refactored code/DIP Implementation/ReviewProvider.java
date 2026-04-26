package com.mycompany.bookstore;

import java.util.List;

public interface ReviewProvider {
    List<Review> getReviewsForBook(Book book);
}