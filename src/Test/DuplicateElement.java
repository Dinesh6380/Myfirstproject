package Test;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
			 
		}
	
	}}

