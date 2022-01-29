package Demo_Loop;

import java.util.Scanner;

public class AlphaTriangle {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number of rows");
		 int rows = sc.nextInt();
		 int i,j;
		 for(i=1;i<=rows;i++)
		 {
			 for(j=1;j<=rows-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(j=1;j<=i;j++)
			 {
				 System.out.print((char)(j+64));
			 }
			 for(j=i-1;j>=1;j--)
			 {
				 System.out.print((char)(j+64));
			 }
			 System.out.println();
		 }
	}

}
