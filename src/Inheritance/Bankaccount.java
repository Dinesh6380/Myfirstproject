package Inheritance;

public class Bankaccount {
	String accountName;
	String accountNumber;
	double Balance = 5000;
	public  Bankaccount(String accountName,String accountNumber)
	{
		this.accountName =accountName;
		this.accountNumber = accountNumber;
	}
	void getAccountName()
	{
		System.out.println(accountName);
	}
	void getAccountNumber()
	{
		System.out.println(accountNumber);
	}
	void getBalance()
	{
		System.out.println(Balance);
	}
	boolean deposit(double amount)
	{	Balance = Balance + amount;
		return true;
	}
	boolean withdraw(double amount)
	{
		if(Balance>amount) {
			Balance = Balance - amount;
			return true;
			}
		return false;
	}

}
