package thread;

public class ReverseByThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		System.out.println("\n=========================");
		System.out.println("\nReverse is");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i+"");
		}
		System.out.println("\n=========================");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
