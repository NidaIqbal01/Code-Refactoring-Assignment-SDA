// a fat interface that mix unrelated responsibilities
interface BookReportService{
void generateSalesReport();
void generateInventoryReport();
    void sendEmailReport();
    void exportToPDF();
}

// define classes that forced to implement everything
class SimpleSalesReport implements BookReportService {

    @Override
    public void generateSalesReport() {
    System.out.println("Generating sales report...");
    }

    @Override
    public void generateInventoryReport() {
    System.out.println("Not supported."); // no need
    }

    @Override
    public void sendEmailReport() {
    System.out.println("Email not supported."); // no need
    }

    @Override
    public void exportToPDF() {
    System.out.println("PDF export not supported."); // no need
    }
}

// another class that also forced everything
class InventoryReport implements ReportService {

    @Override
    public void generateSalesReport() {
  // no need
    }

    @Override
    public void generateInventoryReport() {
        System.out.println("Generating inventory report...");
    }

    @Override
    public void sendEmailReport() {
        System.out.println("Sending inventory report via email...");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting inventory report to PDF...");
    }
}
