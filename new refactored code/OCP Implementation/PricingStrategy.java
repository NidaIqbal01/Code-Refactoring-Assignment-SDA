import java.util.List;

// OCP: New pricing rules (like discounts) can be added without changing Order class
    interface PricingStrategy {
    double calculate(List<Book> books);
    }

    class StandardPricing implements PricingStrategy 
    {
        public double calculate(List<Book> books) {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }
    }

    // OCP: New ways to select books for an order
    interface OrderSelectionStrategy {
    void selectBooks(Order order, Book[] availableBooks, int index);
}


