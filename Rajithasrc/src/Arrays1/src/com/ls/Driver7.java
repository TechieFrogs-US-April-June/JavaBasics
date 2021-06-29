package com.ls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver7 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	/*	Emp7 emp7=new Emp7(10,"Sowjanya","Dev");
		FileOutputStream fos=new FileOutputStream("D://Gayatri");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp7);
		System.out.println("serialization complited");
		*/
		
		FileInputStream fos=new FileInputStream("D://Gayatri");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Emp7 emp7 =(Emp7)oos.readObject();
		System.out.println(emp7.getEno()+"-"+emp7.getEname()+"-"+emp7.getDep());
		
		
	}

}
