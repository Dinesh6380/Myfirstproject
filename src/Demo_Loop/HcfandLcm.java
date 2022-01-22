package Demo_Loop;

import java.util.Scanner;

public class HcfandLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,small,big,hcf=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = sc.nextInt();
		System.out.println("Enter the second number");
		y = sc.nextInt();
		if(x>y) {
			small = y;
			big = x;
		}
		else
		{  small = x;
		   big = y;
		}
		for (int i = small;i>0;i--)
		{
			if(big%i==0 && small%i==0)
			{
				hcf = i;
				System.out.println("HCF of this two number is"+hcf);				
				break;
			}
		}
		
		sc.close();
		}

}
