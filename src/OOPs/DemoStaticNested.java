package OOPs;

public class DemoStaticNested {
	void OuterHello()
	{
		System.out.println("my class1");
	}
	static class InnerDemo
	{
		int x = 100;
		void InnerHello1() {
			DemoStaticNested obj = new DemoStaticNested();
			obj.OuterHello();
			System.out.println("My innerclass1");
		}
	}
	void demoMethod()
	{
		System.out.println("DemoMethod");
		InnerDemo obj = new InnerDemo();
		obj.InnerHello1();
		
	}
	public static void main(String[] args) {
		DemoStaticNested.InnerDemo obj = new DemoStaticNested.InnerDemo();
		obj.InnerHello1();
	}
}
