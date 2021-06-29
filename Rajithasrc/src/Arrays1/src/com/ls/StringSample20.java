package com.ls;

public class StringSample20 {

	public void display() {
		String str = "Welcome! to JavaProgramming";
		  
        char[] destArray = new char[20];
        try {
            
            str.getChars(12, 26, destArray, 0);
            System.out.println(destArray);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
