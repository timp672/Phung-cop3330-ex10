/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App 
{
    static final double TAX_RATE = 0.055;
    public static void main( String[] args )
    {
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        String strPrice1 = scan.nextLine();
        System.out.println("Enter the quantity of item 1: ");
        String strQuan1 = scan.nextLine();
        System.out.println("Enter the price of item 2: ");
        String strPrice2 = scan.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        String strQuan2 = scan.nextLine();
        System.out.println("Enter the price of item 3: ");
        String strPrice3 = scan.nextLine();
        System.out.println("Enter the quantity of item 3: ");
        String strQuan3 = scan.nextLine();

        //processing
        double price1 = Double.parseDouble(strPrice1);
        double quan1 = Double.parseDouble(strQuan1);
        double price2 = Double.parseDouble(strPrice2);
        double quan2 = Double.parseDouble(strQuan2);
        double price3 = Double.parseDouble(strPrice3);
        double quan3 = Double.parseDouble(strQuan3);

        double total1 = price1 * quan1;
        double total2 = price2 * quan2;
        double total3 = price3 * quan3;

        double subtotal = total1 + total2 + total3;
        double tax = subtotal * TAX_RATE;
        double realTotal = subtotal + tax;

        //output
        System.out.println("Subtotal: $" +String.format("%.2f",subtotal));
        System.out.println("Tax: $" +String.format("%.2f",tax));
        System.out.println("Total: $" +String.format("%.2f",realTotal));

    }
}
