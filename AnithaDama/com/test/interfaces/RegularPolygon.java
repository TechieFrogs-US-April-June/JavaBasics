package com.test.interfaces;

public interface RegularPolygon {
	
	// char[] getperimeter = null;
	int getNumSides();
	 int getSideLength();
	 
	 static int totalSides()
	 {
		 RegularPolygon rp1 = new EquilateralTriangle(3);
		 RegularPolygon rp2 = new Square(4);
		 return rp1.getNumSides()+rp2.getNumSides();
		 
	 }
	 default double getperimeter()
	 {
		 int  Length = 2;
		int n = 3;
		double peri = n*Length;
		return peri;
		
	 }
	 default double getInteriorAngle()
	 {
		 
		 int n=10 ;
		double InteriorAngle = (n - 2) * Math.toRadians(180) / n;
		//InteriorAngle = Math.toRadians(InteriorAngle);
		return  InteriorAngle; 
	 }
	
	 
}

