package com.mycompagny.invoise.controller;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController {
    public  void createInvoiceUsingConsole(){

        System.out.println( "Le nom du Client : " );
        Scanner sc=new Scanner(System.in);
        String customerName =sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
//Appel du Service
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);

    }

}
