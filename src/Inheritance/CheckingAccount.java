package Inheritance;

public class CheckingAccount extends Bankaccount{

	public CheckingAccount(String accountName, String accountNumber) {
		super(accountName, accountNumber);
		// TODO Auto-generated constructor stub
	}
	private static int transactionCount=0;
	private static int NUM_FREE;
	private static double TRANS_FEE=3;
	public boolean deposit(double amount)
	{
		if(super.deposit(amount)) {
			transactionCount++;
			return true;
			
		}
		return false;
	}
	public boolean withdraw(double amount)
	{
		if(super.withdraw(amount))
		{
			transactionCount++;
			return true;	
		}
		return false;
	}
	public void deductfees() {
		if(transactionCount > TRANS_FEE)
		{
			double fees = TRANS_FEE * (transactionCount - NUM_FREE);
			if(super.withdraw(fees)) 
				transactionCount=0;
			
		}
	}
	

}
