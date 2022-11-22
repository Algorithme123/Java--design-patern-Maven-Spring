package com.mycompagny.invoise;

import com.mycompagny.invoise.entity.Invoice;
import com.mycompagny.invoise.service.InvoiceService;
import com.mycompagny.invoise.service.InvoiceServiceDaniel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Le nom du Client : " );
        Scanner sc=new Scanner(System.in);
        String customerName =sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);


        System.out.println("Dans quelle Configuration etes vous ?");
        int configration = sc.nextInt();
        if (configration== 1){
            InvoiceService invoiceService = new InvoiceService();
            invoiceService.createInvoice(invoice);

        }else if (configration== 2){
            InvoiceServiceDaniel invoiceServiceDaniel = new InvoiceServiceDaniel();
            invoiceServiceDaniel.createInvoice(invoice);

        }




    }
}
