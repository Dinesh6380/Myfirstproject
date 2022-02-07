package arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int[] a  = new int[n];
		System.out.println("Enter values of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Unsorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length-1;i++)
		{	m = i;
			for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[m])
				m = j;
			int temp = a[i];
			a[i] = a[m];
			a[m] = temp;	
			
		}
		}
		System.out.println("Sorted Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
