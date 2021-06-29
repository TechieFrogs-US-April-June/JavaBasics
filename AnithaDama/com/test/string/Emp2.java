package com.test.string;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Emp2  {

	public static void main(String[] args) throws IOException, ClassNotFoundException   {
		/*Employee1 emp = new Employee1(123,"Dev","abc");
		FileOutputStream fos = new FileOutputStream("Q://Devika");
	ObjectOutputStream oos =  new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("Serialization completed");*/
		
		// Deserializable
		
FileInputStream fis = new FileInputStream("Q://Devika");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee1 emp = (Employee1)ois.readObject();
		System.out.println(emp.getEmpno() +" " + emp.getEmpname() +" " +emp.getDept() );

	}

}
