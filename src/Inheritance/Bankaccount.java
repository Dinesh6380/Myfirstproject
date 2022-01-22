package Inheritance;

public class Bankaccount {
	Scanner sc = new Scanner(System.in);
	String accountName;
	String accountNumber;
	double Balance;
	public Bankaccount(String accountName,String accountNumber)
	{
		accountName = "Dineshkumar";
		accountNumber = "12345678";
	}
	void getAccountname()
	{
		System.out.println(accountName);
	}

}
