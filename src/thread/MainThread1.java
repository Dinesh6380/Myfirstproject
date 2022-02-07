package thread;

public class MainThread1 {

	public static void main(String[] args) {
		try {
			FibonacciByThread o = new FibonacciByThread();
			o.start();
			o.sleep(4000);
			ReverseByThread s = new ReverseByThread();
			s.start();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
