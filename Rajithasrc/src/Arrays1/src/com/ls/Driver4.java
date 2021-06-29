package com.ls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Emp4 e4= new Emp4(100,"A");
		//FileOutputStream fos=new FileOutputStream("D://Abcd");
		//ObjectOutputStream oos= new ObjectOutputStream(fos);
		//oos.writeObject(e4);
		//System.out.println("Serialization completed");
		
		FileInputStream fos=new FileInputStream("D://Abcd");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Emp4 e4=(Emp4) oos.readObject();
		System.out.println(e4.getEno()+"-"+e4.getEname());
		
	}

}
