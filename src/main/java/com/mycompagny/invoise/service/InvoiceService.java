package com.mycompagny.invoise.service;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.repository.InvoiceRepository;
import com.mycompagny.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface{

    private static long  lastNumber =0;

    private InvoiceRepositoryInterface invoiceRepositoryInterface;


    public InvoiceRepositoryInterface  getInvoiceRepositoryInterface() {
        return invoiceRepositoryInterface;
    }

    public void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface) {
        this.invoiceRepositoryInterface = invoiceRepositoryInterface;
    }

    //    Methode pour creer une facture
    public void createInvoice(Invoice invoice){
        invoice.setNumero(String.valueOf(++lastNumber));
        invoiceRepositoryInterface.create(invoice);
    }
}
