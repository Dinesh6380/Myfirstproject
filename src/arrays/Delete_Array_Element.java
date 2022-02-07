package arrays;

import java.util.Scanner;

public class Delete_Array_Element {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the length of array");
	n = sc.nextInt();
	int[] a = new int[n];
	int[] b = new int[n-1];
	System.out.println("Enter value of array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("");	
	System.out.println("Enter index number to delete");
	int x = sc.nextInt();
	for(int i=0,j=0;i<a.length;i++)
	{
		if(i!=x)
		{
			b[j++] = a[i];
		}
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
}
}
