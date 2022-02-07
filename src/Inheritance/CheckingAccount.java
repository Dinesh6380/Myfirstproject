package Inheritance;

import java.util.Scanner;

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
	public static void main(String[] args) {
		CheckingAccount  obj = new CheckingAccount("Dineshkumar", "39649419368");
		int key;
		System.out.println("Enter 1 to deposit");
		System.out.println("Enter 2 to withdraw");
		System.out.println("Enter 3 to Balance");
		System.out.println("Enter 4 to get account name");
		System.out.println("Enter 5 to get account number");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		while(true) {
		switch (key) {
		case 1: obj.deposit(sc.nextDouble());
				obj.deductfees();
				break;
		case 2 : obj.withdraw(sc.nextDouble());
			break;
		case 3: obj.getBalance();
				break;
		case 4 : obj.getAccountName();
				break;
		case 5 : obj.getAccountNumber();
				break;
		case 6 : System.out.println(transactionCount);
		
		default:
			System.out.println("Enter number below 5");
		}
		}
	}

}
