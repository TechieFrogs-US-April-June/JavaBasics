package com.ls;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver6 {
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		/*Emp6 emp6=new Emp6(10,"Sowjanya","Dev");
		FileOutputStream fos=new FileOutputStream("D://Gayatri");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp6);
		System.out.println("serialization complited");
		*/
		
		
		FileInputStream fos=new FileInputStream("D://Gayatri");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Emp6 emp6 =(Emp6)oos.readObject();
		System.out.println(emp6.getEno()+"-"+emp6.getEname()+"-"+emp6.getDep());
}

}
