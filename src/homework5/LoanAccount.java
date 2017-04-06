/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;


import java.util.Scanner;

public class LoanAccount extends Account
{
	private double rate;
        private int year;// TO DO: Declare LoanAccount Variables

	// constructor to initialize  
    public LoanAccount(String firstName, String lastName, int accountNumber, double balance)
    {
		super(firstName, lastName, accountNumber, balance);// TO DO: explicitly call constructor from super class  
	}
	
	public void set // TO DO: Define get and set methods along with any additional methods needed	
	
	// method for to obtain interest rate and # years and then calculate interest
	public void calcInterest()
	{
		// TO DO: Defire calcInterest method
	}
        
        public void setRate(double rate)
        {
            this.rate= rate;
            
        }
        
        public double getRate()
        {
            
            return rate;
        }
        
         public void setYear(int year)
        {
            this.year= year;
            
        }
        
        public int getYear()
        {
            
            return year;
        }
	
} // end class LoanAccount
