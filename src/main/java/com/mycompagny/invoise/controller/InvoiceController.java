package com.mycompagny.invoise.controller;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.service.InvoiceService;
import com.mycompagny.invoise.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceController  implements InvoiceControllerInterface{


    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    private InvoiceServiceInterface invoiceServiceInterface;
    public  void createInvoice(){

        System.out.println( "Le nom du Client : " );
        Scanner sc=new Scanner(System.in);
        String customerName =sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
//Appel du Service
        invoiceServiceInterface.createInvoice(invoice);

    }

}
