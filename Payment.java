/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wahyudi
 */
public class Payment 
{
    private double amount;
    
    //constructor without arguments
    public Payment()
    {
        amount = 0.0;
    }
    
    //constructor with arguments
    public Payment(double amount)
    {
        this.amount = amount;
    }
    
    //setter
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    
    //getter
    public double getAmount()
    {
        return this.amount;
    }
    
    //toString
    public String toString()
    {
        return "amount paid is "+getAmount(); 
    }
}
