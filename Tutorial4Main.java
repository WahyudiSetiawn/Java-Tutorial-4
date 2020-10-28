/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
        
public class Tutorial4Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {  
       /*
       //new object from CashPayment Class
       CashPayment cp1 = new CashPayment(1000);
       CashPayment cp2 = new CashPayment(2000);
       System.out.println(cp1.toString());
       System.out.println(cp2.toString());
       
       //new object from CreditCardPayment
       CreditCardPayment cs1 = new CreditCardPayment(15000, "Wahyudi", "10/15", "1523456");
       CreditCardPayment cs2 = new CreditCardPayment(25000, "Setiawan", "10/10", "1532342");
       System.out.println(cs2.toString());
       System.out.println(cs1.toString());
       */
       
       Scanner key = new Scanner(System.in);
       /*
       char ans = 'y';
       
       while(ans == 'y')
       {
           System.out.print("Sales amount? ");
           double amnt = key.nextDouble();
           
           System.out.print("Payment type? <Cash> or <Credit> ");
           String pay = key.next();
           
           if (pay.equalsIgnoreCase("Cash"))
           {
               CashPayment cp3 = new CashPayment(amnt);
               System.out.println(cp3.toString());
           }
           else if (pay.equalsIgnoreCase("Credit"))
           {
               System.out.print("Credit Card Holder: ");
               String nm = key.next();
               System.out.print("Expire on: (mm/yy) ");
               String ed = key.next();
               System.out.print("Credit Card Number: ");
               String ccn = key.next();
               System.out.println("");
               CreditCardPayment cs3  = new CreditCardPayment(amnt, nm, ed, ccn);
               System.out.println(cs3.toString());
           }
           System.out.print("Do you want to retry?(y/n) ");
           ans = key.next().charAt(0);
       }
       */
       double TotalAmount = 0;
       int CashAmount = 0;
       int CreditAmount = 0;
       ArrayList<Payment> paymentObject = new ArrayList<>();
       
       for (int i=0; i<8; i++) //melakukan perulangan sebanyak 8 kali
       {
           System.out.print("Sales amount? ");
           double amnt = key.nextDouble();
           
           System.out.print("Payment type? <Cash> or <Credit> ");
           String pay = key.next();
           
           if (pay.equalsIgnoreCase("Cash"))
           {
               CashPayment cp3 = new CashPayment(amnt);
               paymentObject.add(new CashPayment(amnt)); //menambahkan amnt (nilai amount) ke object CasPayment lalu masuk ke ArrayList
               System.out.println(cp3.toString());
           }
           else if (pay.equalsIgnoreCase("Credit"))
           {
               System.out.print("Credit Card Holder: ");
               String nm = key.next();
               System.out.print("Expire on: (mm/yy) ");
               String ed = key.next();
               System.out.print("Credit Card Number: ");
               String ccn = key.next();
               System.out.println("");
               CreditCardPayment cs3  = new CreditCardPayment(amnt, nm, ed, ccn);
               paymentObject.add(new CreditCardPayment(amnt, nm, ed, ccn));
               System.out.println(cs3.toString());
           }
       }
       
       System.out.println("");
       System.out.println("Payment Stored");
       for (int i=0; i<paymentObject.size(); i++) 
       {
           System.out.println((i+1)+". "+paymentObject.get(i).toString());
       }
       
       for (Payment i : paymentObject)
       {
           TotalAmount+= i.getAmount();
           if (i instanceof CashPayment)
           {
               CashAmount++;
           }
           else if (i instanceof CreditCardPayment)
           {
               CreditAmount++;
           }
       }
       
        System.out.println("");
        System.out.println("Payment more than 1500.0");
        
        for (Payment i : paymentObject)
        {
            if (i.getAmount() > 1500)
            {
                System.out.println("- "+ i.toString());
            }
        }
        
        System.out.println("");
        System.out.println("Total amount: "+TotalAmount);
        System.out.println("Total cash: "+CashAmount);       
        System.out.println("Total credit: "+CreditAmount);
    }
    
}
