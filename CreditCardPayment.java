/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CreditCardPayment extends Payment
{
    private String name;
    private String expireDate;
    private String number;
    
    //constructor without arguments
    public CreditCardPayment()
    {
        name = "";
        expireDate = "";
        number = "";
    }
    
    //constructor with arguments
    public CreditCardPayment(double amount, String name, String expireDate, String number)
    {
        super(amount);
        this.name = name;
        this.expireDate = expireDate;
        this.number = number;
    }
    
    //setter
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setExpireDate(String expireDate)
    {
        this.expireDate = expireDate;
    }
    
    public void setNumber(String number)
    {
        this.number = number;
    }
    
    //getter
    public String getName()
    {
        return this.name;
    }
    
    public String getExpireDate()
    {
        return this.expireDate;
    }
    
    public String getNumber()
    {
        return this.number;
    }
    
    //toString
    public String toString()
    {
        return ("Using card ("+getName()+" ["+getNumber()+"] exp: "+getExpireDate()+")"+"\n"+ "for credit-card payment, "+super.toString());
    }
}
