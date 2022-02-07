package thread;

import java.util.Scanner;

public class FibonacciByThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int a=0,b=1,c=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the limit of fibonacci");
			int n = sc.nextInt();
			System.out.println("Fibonacci series");
			while(n>0)
			{
				System.out.println(c+"");
				a=b;
				b=c;
				c=a+b;
				n--;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
