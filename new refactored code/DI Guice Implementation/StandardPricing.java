/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

import java.util.List;

    class StandardPricing implements PricingStrategy 
    {
        public double calculate(List<Book> books) {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }
    }
