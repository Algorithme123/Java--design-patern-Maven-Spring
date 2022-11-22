package com.mycompagny.invoise.service;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.repository.InvoiceRepository;

public class InvoiceService {

    private static long  lastNumber =0;

    private InvoiceRepository invoiceRepository = new InvoiceRepository();


//    Methode pour creer une facture
    public void createInvoice(Invoice invoice){
        invoice.setNumero(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
