package com.mycompagny.invoise;

import com.mycompagny.invoise.controller.InvoiceControllerInterface;
import com.mycompagny.invoise.controller.InvoiceControllerKeyboard;
import com.mycompagny.invoise.controller.InvoiceControllerWeb;
import com.mycompagny.invoise.controller.InvoiceControllerDouchette;
import com.mycompagny.invoise.repository.InvoiceRepositoryInterface;
import com.mycompagny.invoise.repository.InvoiceRepositoryMemory;
import com.mycompagny.invoise.repository.InvoiceRepositoryDataBase;
import com.mycompagny.invoise.service.InvoiceServiceInterface;
import com.mycompagny.invoise.service.InvoiceServiceNumber;
import com.mycompagny.invoise.service.InvoiceServicePrefix;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Scanner sc = new Scanner(System.in) ;
        System.out.println("Quel est le type de controller (keyboard , web, douchette)?");
        String controllerType = sc.nextLine();

        System.out.println("Quel est le type de service  (number , prefix)?");
        String serviceType = sc.nextLine();

        System.out.println("Quel est le type de repository (memory ,  database )?");
        String repositoryType = sc.nextLine();

        InvoiceControllerInterface invoiceControllerInterface = null;

        switch (controllerType){

            case "keyboard":
                invoiceControllerInterface = new InvoiceControllerKeyboard();
                break;
            case "web":
                invoiceControllerInterface= new InvoiceControllerWeb();
                break;
                case "douchette":
                    invoiceControllerInterface = new InvoiceControllerDouchette();
         }

        InvoiceServiceInterface invoiceServiceInterface = null;

        switch (serviceType){
            case "number":
                invoiceServiceInterface = new InvoiceServiceNumber();
                break;
            case "prefix":
                invoiceServiceInterface = new InvoiceServicePrefix();
                break;
        }

        InvoiceRepositoryInterface invoiceRepositoryInterface = null;

        switch (repositoryType){
            case "memory":
                invoiceRepositoryInterface = new InvoiceRepositoryMemory();
                break;
                case "database":
                    invoiceRepositoryInterface = new InvoiceRepositoryDataBase();
                    break;
        }
        invoiceControllerInterface.setInvoiceServiceInterface(invoiceServiceInterface);
        invoiceServiceInterface.setInvoiceRepositoryInterface(invoiceRepositoryInterface);
        invoiceControllerInterface.createInvoice();



    }
}
