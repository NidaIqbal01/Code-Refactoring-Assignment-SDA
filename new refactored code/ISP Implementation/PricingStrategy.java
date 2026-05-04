import java.util.List;

    class StandardPricing 
    {
        public double calculate(List<Book> books) {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }
    }

    // OCP: New ways to select books for an order
    interface OrderSelectionStrategy {
    void selectBooks(Order order, Book[] availableBooks, int index);
}
