package thread;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("Running thread1");
		//Thread2 t2 = new Thread2("Running thread2");
		t1.start();
		Thread1.handle(new Thread1("INT"),signal -> System.out.println("intereupted by ctrl+c"));
			
			 
	}

}
