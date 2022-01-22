package StringClass;

import java.util.Scanner;

public class AnegramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the first String");
		String s1 = sc.next();
		System.out.println("Enter the second String");
		String s2 = sc.next();
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		int s = a.length;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				if(a[i]==b[j])
				{				
					n++;
				}
			}
		}
		if(n==s)
		{
			System.out.println("the given string is anegram");
		}
		else
		{
			System.out.println("The given string is not anegram");
		}
	}

}
