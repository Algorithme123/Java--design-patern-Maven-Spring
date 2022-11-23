package com.mycompagny.invoise.service;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.repository.InvoiceRepository;
import com.mycompagny.invoise.repository.InvoiceRepositoryDanielJDBC;

public class InvoiceServiceDaniel {

    private static long  lastNumber =112;

    private InvoiceRepositoryDanielJDBC invoiceRepositoryDanielJDBC = new InvoiceRepositoryDanielJDBC();


//    Methode pour creer une facture
    public void createInvoice(Invoice invoice){
        invoice.setNumero(String.valueOf("DNL_"+ (++lastNumber)));
        invoiceRepositoryDanielJDBC.create(invoice);
    }
}
