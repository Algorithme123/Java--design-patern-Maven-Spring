package com.mycompagny.invoise.controller;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerDouchette implements  InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceServiceInterface;


    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public void createInvoice() {
        System.out.println("Utilisation d'un Scanner");

        Invoice invoice = new Invoice();
        invoice.setCustomerName("Google Pixels");
        invoiceServiceInterface.createInvoice(invoice);

    }
}
