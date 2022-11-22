package com.mycompagny.invoise;

import com.mycompagny.invoise.controller.InvoiceController;
import com.mycompagny.invoise.controller.InvoiceControllerDaniel;
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

        System.out.println("Dans quelle Configuration etes vous ?");
        Scanner sc = new Scanner(System.in) ;
        int configration = sc.nextInt();


        if (configration== 1){
            InvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoiceUsingConsole();

        }else if (configration== 2){

            InvoiceControllerDaniel invoiceControllerDaniel = new InvoiceControllerDaniel();
            invoiceControllerDaniel.createInvoiceUsingWebForm();

        }




    }
}
