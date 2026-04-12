package com.mycompany.bookstore;
import java.text.DecimalFormat;

public class PaymentService {

    public void processPayments(Customer[] customers, Book[] books) {
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < customers.length; i++) {
            double total = books[i * 2].getPrice() + books[i * 2 + 1].getPrice();

            if (Payment.processPayment(customers[i], total)) {
                System.out.println("Payment successful for " 
                    + customers[i].getUsername() + " - $" + df.format(total));
            } else {
                System.out.println("Payment failed for " 
                    + customers[i].getUsername());
            }
        }
    }
}
