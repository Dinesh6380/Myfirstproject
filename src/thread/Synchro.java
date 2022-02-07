package thread;
class M1 extends Thread{
	Synchro s;
	public M1(Synchro s)
	{
		this.s=s;
		start();
	}
		public void run()
		{
			s.deposit(1000);
		}
}
class M2 extends Thread{
	Synchro s;
	public M2(Synchro s)
	{
		this.s=s;
		start();
	}
		public void run()
		{
			s.deposit(500);
		}
	
}
public class Synchro {
	int bal = 1000;
	synchronized void deposit(int amt) {
		int temp = bal;
		temp = bal + amt;
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		bal = temp;
		System.out.println("Account Balance"+bal);
	}
	public static void main(String[] args) {
		Synchro s = new Synchro();
		System.out.println(s);
		new M1(s);
		new M2(s);
		
	}
}
