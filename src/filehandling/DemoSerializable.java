package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerializable {
public static void main(String[] args) {
		Employee e = new Employee(21, "Dineshkumar");
		try {
			FileOutputStream Fileout = new FileOutputStream("D:/MyEmployee.ser");
			ObjectOutputStream out = new ObjectOutputStream(Fileout);
			out.writeObject(e);
			out.close();
			Fileout.close();
			System.out.printf("Serialized file is saved in /tmp/Employee.ser");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
}
}
