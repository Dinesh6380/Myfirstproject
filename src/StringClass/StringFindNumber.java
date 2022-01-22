package StringClass;

import java.util.Scanner;

public class StringFindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0,char2=0;
			for(int j=0;j<i;j++)
			{
				if(ch[j]==ch[i]) {
					char2++;
					
				}
			}
			if(char2==0)
			{
				for(int k=i;k<ch.length;k++)
				{
					cnt++;
				}
			}
			System.out.println(ch[i]+"Occure::"+cnt+"Times");
		}
	}

}
