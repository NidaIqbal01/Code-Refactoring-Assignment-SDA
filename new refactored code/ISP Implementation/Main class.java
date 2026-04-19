package reportdemo;

public class ReportDemo {
    public static void main(String[] args) {

        SalesReportGenerator salesReport = new SimpleSalesReport();
        salesReport.generateSalesReport();

        System.out.println();

        InventoryReport inventoryReport = new InventoryReport();
        inventoryReport.generateInventoryReport();
        inventoryReport.sendEmailReport();
        inventoryReport.exportToPDF();
    }
}   
