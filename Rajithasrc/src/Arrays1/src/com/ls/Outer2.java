package com.ls;

public class Outer2 {

	private int eno=100;
	private static String ename="A";
		static class Inner
		{
			public static void disp()
			{
				System.out.println(ename);
			}
		}
		
		public void show()
		{
			Inner.disp();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
