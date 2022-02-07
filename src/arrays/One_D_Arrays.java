package arrays;

import java.util.Scanner;

public class One_D_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int[] a = new int[5];
		System.out.println("Enter the array values");
		Scanner sc =  new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					k = a[i];
					a[i] = a[j];
					a[j] = k;
					
				}
			}
		}
		System.out.println("Smallest number is"+k);
	}

}
