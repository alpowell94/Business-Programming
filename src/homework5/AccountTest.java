
package homework5;

import java.util.Scanner;


public class AccountTest {


public static void main(String[] args)
   {
	Scanner input = new Scanner(System.in);
	
	// create Account objects
	Account account1 = new Account("John", "Doe", 1001, 100.99);
	Account account2 = new Account("Mary", "Smith", 1002, 25.15);	

	// display data
	System.out.printf("%nAccount #: %d%nFirst Name: %s%nLast Name: %s%nBalance: $%.2f%n", 
	account1.getAccountNumber(), account1.getFirstName(), account1.getLastName(), account1.getBalance() );

	// display data	
	System.out.printf("%nAccount #: %d%nFirst Name: %s%nLast Name: %s%nBalance: $%.2f%n%n", 
	account2.getAccountNumber(), account2.getFirstName(), account2.getLastName(), account2.getBalance() );	
	
	} // end main
} // end class AccountTest