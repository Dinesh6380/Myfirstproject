package arrays;

import java.util.Scanner;

public class FactorialArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int a = sc.nextInt();
		int x=0;
		int[] n = new int[a];
		for(int i=0;i<a;i++)
		{
			n[i] = sc.nextInt();
		}
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					x = n[i];
					n[i] = n[j];
					n[j] = x;
				}
			}
		}
		int m = n[0];
		for(int i = 0;i<a;i++)
		{
			if(n[i]>m)
			{
				m = n[i];
			}
		}
		for(int i = 0;i<)

	}

}
