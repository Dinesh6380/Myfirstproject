package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bean_Class1> arr = new ArrayList<Bean_Class1>();
		arr.add(new Bean_Class1(201,88792,"Dineshkumar"));
		arr.add(new Bean_Class1(202,88793,"Mohan"));
		arr.add(new Bean_Class1(200,88791,"karthi"));
		Collections.sort(arr , new StudentComparator());
		for(Bean_Class1 b : arr)
		{
			System.out.println(b.getId()+""+b.getName()+""+b.getContact());
		}
	}

}
