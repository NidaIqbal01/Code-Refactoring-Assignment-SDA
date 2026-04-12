/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

import java.util.List;

interface PricingStrategy {
    double calculate(List<Book> books);
    }
