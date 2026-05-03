
package com.mycompany.bookstore;

public class ReportDemo {
        SalesReportGenerator salesReport = new SimpleSalesReport();
        salesReport.generateSalesReport();

        System.out.println();

        InventoryReport inventoryReport = new InventoryReport();
        inventoryReport.generateInventoryReport();
        inventoryReport.sendEmailReport();
        inventoryReport.exportToPDF();
}
