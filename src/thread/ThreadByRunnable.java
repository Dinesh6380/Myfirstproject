package thread;

public class ThreadByRunnable extends Thread{		
		int time;
		Thread thread;
		public ThreadByRunnable(int time,String name) {
			this.time=time;
			thread = new Thread(this,name);
			thread.start();
		}
		@Override
		public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread());
			try {
				thread.sleep(time);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			thread.setName("Hello");
			thread.getName();
			
		}
		System.out.println("Thread State"+thread.getState());
		System.out.println("Thread is live"+thread.isAlive());
		System.out.println("Threads priority"+thread.getPriority());
		System.out.println("Class of thread"+thread.getClass());
		System.out.println("Active counts"+thread.activeCount());
		
		}

}
