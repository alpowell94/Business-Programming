/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.util.Scanner;

public class LoanAccountTest {
    
public static void main(String[] args)
   {
	Scanner input = new Scanner(System.in);

	// create LoanAccount objects
	LoanAccount account1 = new LoanAccount("John", "Doe", 1001, 100.99);
	LoanAccount account2 = new LoanAccount("Mary", "Smith", 1002, 25.15);	

	System.out.printf("%n%n*** Inital Data ***%n");	
	
	// display initial data		
	System.out.printf("%nAccount #: %d%nFirst Name: %s%nLast Name: %s%nBalance: $%.2f%n", 
	account1.getAccountNumber(), account1.getFirstName(), account1.getLastName(), account1.getBalance() );

	// display initial data		
	System.out.printf("%nAccount #: %d%nFirst Name: %s%nLast Name: %s%nBalance: $%.2f%n", 
	account2.getAccountNumber(), account2.getFirstName(), account2.getLastName(), account2.getBalance() );	

	System.out.printf("%n%n*** Enter Interest Data ***%n");

	// calls LoanAccount class method calcInterst
	account1.calcInterest();
	account2.calcInterest();	
	
	System.out.printf("%n%n*** After Interest Calculation ***%n");

	// display interest data	
	System.out.printf("%nBalance in Acct #%d after %d year(s) with a %.2f%% interest rate = $%.2f%n", 
	account1.getAccountNumber(), account1.getYear(), account1.getRate(), account1.getBalance() );

	// display interest data	
	System.out.printf("Balance in Acct #%d after %d year(s) with a %.2f%% interest rate = $%.2f%n%n", 
	account2.getAccountNumber(), account2.getYear(), account2.getRate(), account2.getBalance() );
	
	} // end main
	
} // end class LoanAccountTest
