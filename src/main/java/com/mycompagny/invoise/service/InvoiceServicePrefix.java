package com.mycompagny.invoise.service;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface{

    private static long  lastNumber =112;


    private InvoiceRepositoryInterface invoiceRepositoryInterface;

    public InvoiceRepositoryInterface getInvoiceRepositoryInterface() {
        return invoiceRepositoryInterface;
    }

    public void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface) {
        this.invoiceRepositoryInterface = invoiceRepositoryInterface;
    }

    //    Methode pour creer une facture
    public void createInvoice(Invoice invoice){
        invoice.setNumero(String.valueOf("DNL_"+ (++lastNumber)));
        invoiceRepositoryInterface.create(invoice);
    }
}
