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
        System.out.println("Quel est la classe de controller ?");
        String controllerClass = sc.nextLine();

        System.out.println("Quel est la classe du Service ?");
        String serviceClass = sc.nextLine();

        System.out.println("Quel est la classe repository ?");
        String repositoryClass = sc.nextLine();

        InvoiceControllerInterface invoiceControllerInterface = null;



        InvoiceServiceInterface invoiceServiceInterface = null;



        InvoiceRepositoryInterface invoiceRepositoryInterface = null;

try {
    invoiceControllerInterface = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
    invoiceServiceInterface = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
    invoiceRepositoryInterface = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();

}
catch (Exception e){
    e.printStackTrace();
}
        invoiceControllerInterface.setInvoiceServiceInterface(invoiceServiceInterface);
        invoiceServiceInterface.setInvoiceRepositoryInterface(invoiceRepositoryInterface);
        invoiceControllerInterface.createInvoice();



    }
}
