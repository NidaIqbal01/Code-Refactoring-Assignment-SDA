/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

// --- NEW INTERFACE FOR DIP ---
import java.util.List;

public interface ReviewProvider {
    List<Review> getReviewsForBook(Book book);
}
