package reportdemo;

    interface SalesReportGenerator {
    void generateSalesReport();
}

class SimpleSalesReport implements SalesReportGenerator {

    @Override
    public void generateSalesReport() {
        System.out.println("Generating sales report...");
    }
}
