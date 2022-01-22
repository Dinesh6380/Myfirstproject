package Demo_Loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,fact=1;
		Scanner sn=new Scanner(System.in);
		a = sn.nextInt();
		for(int i=a;i>0;i--)
		{
				fact = fact * i;
		}
		System.out.println("Factorial = "+fact);	
	}

}
