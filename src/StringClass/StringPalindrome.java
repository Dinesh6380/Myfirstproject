package StringClass;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class StringPalindrome {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
		 BufferedReader brr = new BufferedReader(r);
		 String s = brr.readLine();
		 String s1 = " ";
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 s1=s1+s.charAt(i);
		 }
		 if(s1==s)
		 {
			 System.out.println("The String is Palindrome");
		
		 }
		 else
		 {
			 System.out.println("The String is not Palindrome");
		 }
	}

}
