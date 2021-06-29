package com.test.interfaces;


public class InterfaceProgram1  {
	

	public static void main(String[] args) {
		EquilateralTriangle et = new EquilateralTriangle(5);
		Square sq = new Square(6);
	System.out.println( " equilateralTriangle peri : " 	+et.getperimeter());
	System.out.println("interior angle  :" +et.getInteriorAngle());
	System.out.println( " square peri : " 	+sq.getperimeter());
	System.out.println(" square interior angle  :" +sq.getInteriorAngle());		
	
	
	

	}
}
