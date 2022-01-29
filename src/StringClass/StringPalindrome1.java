package StringClass;

import java.util.Arrays;

public class StringPalindrome1 {

	public static void main(String[] args) {
		 String p = "" ;
		 int x=0;
		String s = "madam likes pop malayalam";
		String arr[] = s.split(" ");
		for(int i=0;i<arr.length-1;i++)
		{	String[] b = arr[i].split(" ");
			String[] c = b[x].split(" ");
			x++;
			for(int j=c.length-1;j>=0;--j)
			{	//String[] c = b[j].split(" ");
				p=p+c[j];				
			}
			if(p.equals(arr[i])) {
				System.out.println(p);
				p=" ";}
			else {
				System.out.println("hey");
			}
					
		}
	}
}


