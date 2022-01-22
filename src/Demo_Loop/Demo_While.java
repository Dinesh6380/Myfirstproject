package Demo_Loop;

import java.util.Scanner;

public class Demo_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a,n=1;
	Scanner scanner = new Scanner(System.in);
	a = scanner.nextInt();
	System.out.println("Table of 5: ");
	while(n<=a)
	{
		System.out.println("5 * "+n);
		System.out.println(5*n);
		n++;
	}
			
	}

}
