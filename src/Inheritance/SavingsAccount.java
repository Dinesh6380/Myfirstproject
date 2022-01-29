package Inheritance;

import java.util.Scanner;

public class SavingsAccount extends Bankaccount{
	double interestRate;
	String accNumber,accName;
	public SavingsAccount(String accName,String accNumber,double interestRate)
	{	
		super(accName,accNumber);
		this.interestRate=interestRate;
	}
	void addInterest(double Balance)
	{
		Balance = Balance + Balance*interestRate/100;
		System.out.println("Balance with Interest is "+Balance);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount obj = new SavingsAccount("Dineshkumar","12345678",5);				
		System.out.println("To Get Account Name press 1");
		System.out.println("To Get Account Number press 2");
		System.out.println("To Get Account Balance press 3");
		System.out.println("To Deposit amount  press 4");
		System.out.println("To Withdraw amount press 5");
		int n = sc.nextInt();
		switch(n) {
			case 1 :obj.getAccountName();
				break;
			case 2 :obj.getAccountNumber();
				break;
			case 3 :obj.getBalance();
				break;
			case 4 :System.out.println("Enter amount to deposit");
				obj.deposit(sc.nextDouble());
				break;
			case 5 :System.out.println("Enter amount to withdraw"); 
				obj.withdraw(sc.nextDouble());
				break;
			default : System.out.println("Press the number 1 to 5");
				break;
			
		}
					sc.close();}
	}
