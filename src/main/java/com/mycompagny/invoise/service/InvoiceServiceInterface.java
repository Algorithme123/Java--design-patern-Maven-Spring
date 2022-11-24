package com.mycompagny.invoise.service;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

     void createInvoice(Invoice invoice);
     void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface);
}
