package StringClass;

import java.util.Scanner;

public class StringFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Piedmont, or mountain, glaciers are found in many parts of the world.";
		String[] a=s.split(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String to find");
		String b = sc.next();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				System.out.println("Your String is found");
				break;
			}
			
		}
		
		}

}
