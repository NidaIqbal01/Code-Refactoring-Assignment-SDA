/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
