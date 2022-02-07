package thread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadByThread("one", 1000);
		new ThreadByRunnable(1000, "Dinesh");
		new ThreadByRunnable(2300, "kumar");
	}

}
