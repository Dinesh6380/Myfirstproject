package arrays;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int x=0;
		System.out.println("Enter array values");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					x = x + a[i][j];
				}
			}
		}
		System.out.println("Sum of Diagonals"+x);
		sc.close();
	}

}
