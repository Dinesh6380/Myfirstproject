package OOPs;

public class UseOFThis {
	String name;
	public UseOFThis(String name)
	{
		this.name = name;
	}
	public UseOFThis()
	{
		System.out.println("Default Constructor");
	}
	public void show()
	{
		System.out.println("your name is "+name);
	}
	public static void main(String[] args) {
		UseOFThis obj = new UseOFThis("Dinesh");
		obj.show();
		UseOFThis obj1 = new UseOFThis("Kumar");
		obj1.show();
		UseOFThis obj2 = new UseOFThis();
		obj2.show();
	}
}
