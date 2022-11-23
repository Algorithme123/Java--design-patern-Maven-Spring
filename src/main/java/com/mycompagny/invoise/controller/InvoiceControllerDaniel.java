package com.mycompagny.invoise.controller;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.service.InvoiceService;
import com.mycompagny.invoise.service.InvoiceServiceDaniel;
import com.mycompagny.invoise.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceControllerDaniel implements InvoiceControllerInterface{

    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public  void createInvoice(){


        String customerName = " Monsieur Web";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
//Appel du Service
        invoiceServiceInterface.createInvoice(invoice);

    }
}
