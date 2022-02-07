package thread;

public class ThreadByThread extends Thread {
	int time;
	public ThreadByThread(String name,int time) {
		super(name);
		this.time=time;
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread());
			try {
				sleep(time);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
