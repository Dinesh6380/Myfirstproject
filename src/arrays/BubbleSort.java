package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter values of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sn.nextInt();
		}
		System.out.println("Unsorted Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		System.out.println("Sorted Array");
		for(int i=0;i<n;++i)
		{
			System.out.println(a[i]+"");
		}

	}

}
