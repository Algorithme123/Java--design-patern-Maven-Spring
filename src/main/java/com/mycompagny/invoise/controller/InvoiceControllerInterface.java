package com.mycompagny.invoise.controller;

import com.mycompagny.invoise.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {

     void createInvoice();
     void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface);
}
