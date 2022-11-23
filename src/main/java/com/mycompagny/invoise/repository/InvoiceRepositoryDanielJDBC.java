package com.mycompagny.invoise.repository;

import com.mycompagny.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryDanielJDBC implements InvoiceRepositoryInterface{


    private static List<Invoice> invoices = new ArrayList<Invoice>();

    //Methode pour ajouter une facture
    public  void create(Invoice invoice){
              /* PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO FACTURE (NUMBER, CUSTOMERNAME) VALUES (?,?')");

        preparedStatement.executeUpdate();
        */

        invoices.add(invoice);
        System.out.println(" Facture Numero : "+invoice.getNumero()+" pour Mr "+ invoice.getCustomerName() +" Ajouter avec success");

    }
}
