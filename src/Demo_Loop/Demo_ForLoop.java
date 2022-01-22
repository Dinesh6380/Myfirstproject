package Demo_Loop;

import java.util.Scanner;

public class Demo_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit");
		n = sc.nextInt();
		for(int i=0;i<=n;i+=2)
		{	sum = sum + i;
					
		}
		System.out.println("The sum of even number is"+sum);
	}

}
