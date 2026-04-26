/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

public class InventoryReport implements InventoryReportGenerator, EmailSender, PDFExporter {

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
