package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

public class throws_example {
	public void m() throws IOException,RemoteException,Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader brr = new BufferedReader(r);
		System.out.println("Enter name");
		String name = brr.readLine();
		System.out.println(name);
	}
	public void n() throws RemoteException, IOException, Exception
	{
		m();
	}
	public static void main(String[] args) throws RemoteException, IOException, Exception {
		throws_example obj = new throws_example();
		obj.n();
	}
}