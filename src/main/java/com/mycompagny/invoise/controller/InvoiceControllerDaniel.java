package com.mycompagny.invoise.controller;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.service.InvoiceService;
import com.mycompagny.invoise.service.InvoiceServiceDaniel;

import java.util.Scanner;

public class InvoiceControllerDaniel {


    public  void createInvoiceUsingWebForm(){

//        System.out.println( "Le nom du Client : " );
//        Scanner sc=new Scanner(System.in);

//        String customerName =sc.nextLine();

        String customerName = " Monsieur Web";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
//Appel du Service
        InvoiceServiceDaniel invoiceServiceDaniel = new InvoiceServiceDaniel();
        invoiceServiceDaniel.createInvoice(invoice);

    }
}
