/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore.with.dip;

import com.google.inject.AbstractModule;

public class BookstoreModule extends AbstractModule {
    @Override
    protected void configure() {
        // 1. Bind the Inventory logic
        // Whenever someone needs an InventoryRepository, give them the Inventory class
        bind(InventoryRepository.class).to(Inventory.class);

        // 2. Bind the Payment logic
        // Whenever someone needs a PaymentProcessor, use the PayPal version
        bind(PaymentProcessor.class).to(PayPalProcessor.class);

        // 3. Bind the Pricing logic
        // This tells the OrderService to use StandardPricing by default
        bind(PricingStrategy.class).to(StandardPricing.class);
    }
}
