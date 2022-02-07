package arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int f=0,l=0;
		System.out.println("Enter number of test cases");
		int x=sc.nextInt();
		int[] b = new int[x];
		int[] a = new int[x];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{	int n = a[i];
			l=n%10;
			while(n!=0)
			{
				f=n%10;
				n=n/10;
			}
			b[i]=f+l;
			f=0;
			l=0;
		}
		System.out.println("Sum of first and last digit");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
