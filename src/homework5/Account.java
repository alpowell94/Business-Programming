
package homework5;


public class Account {
	private String firstName;
        private String lastName;
        private int accountNumber;
        private double balance;
	
		
	// constructor to initialize  
   	public Account(String firstName, String lastName, int accountNumber, double balance)
   	{
		this.firstName = firstName;
                this.lastName = lastName;
                this.accountNumber = accountNumber;
                this.balance = balance;
	}
	
	public void setFirstName(String firstName)
        {
            this.firstName = firstName;
            
        }
        
        public String getFirstName()
        {
            return firstName;
            
        }
        
       public void setLastName(String lastName)
        {
            this.lastName = lastName;
            
        }
        
        public String getLastName()
        {
            return lastName;
            
        }	
        
        public void setAccountNumber(int accountNumber)
        {
            this.accountNumber = accountNumber;
            
        }
        
        
        public int getAccountNumber()
        {
            return accountNumber;
            
        }	
        
       public void setBalance(double balance)
        {
            this.balance = balance;
            
        }
        
        public double getBalance()
        {
            return balance;
            
        }
    
}
