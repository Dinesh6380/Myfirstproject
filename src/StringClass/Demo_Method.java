package StringClass;

import java.util.Scanner;

public class Demo_Method {
	public String Name(String name)
	{
		String s = "welcome "+name;
		return s;
	}
	public String place(String Native)
	{
		String a="Your Native is "+Native;
		return a;
	}
	public void Age(int age)
	{
	System.out.println("Your age is "+age);
		
	}
	public String Edu(String edu)
	{
		String b = "Your Education is "+edu;
		return b;
	}
	public void Welcome()
	{
		System.out.println("Thankyou for your information");
		
	}
	public static void main(String[] args) {
		Demo_Method obj = new Demo_Method();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String w = sc.next();
		System.out.println("Enter Your Age");
		int x = sc.nextInt();
		System.out.println("Where are you belongs from");
		String y = sc.next();
		System.out.println("what is your Education");
		String z = sc.next();
		System.out.println(obj.Name(w));
		obj.Age(x);
		System.out.println(obj.place(y));
		System.out.println(obj.Edu(z));
		obj.Welcome();
	}
}
