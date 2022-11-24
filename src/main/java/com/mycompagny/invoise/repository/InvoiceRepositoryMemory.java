package com.mycompagny.invoise.repository;

import com.mycompagny.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMemory implements  InvoiceRepositoryInterface{


    private static List<Invoice> invoices = new ArrayList<Invoice>();

    //Methode pour ajouter une facture
    public  void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println(" Facture Numero : "+invoice.getNumero()+" pour Mr "+ invoice.getCustomerName() +" Ajouter avec success");

    }
}
