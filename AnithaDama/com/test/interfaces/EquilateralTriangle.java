package com.test.interfaces;

public class EquilateralTriangle implements RegularPolygon    {
	
   private int Length ;
   
   public EquilateralTriangle(int Length  ) {
	  this. Length =Length;
	   
   }
	

/*	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}*/
	
	public int getNumSides()
	{
		return 3;
	}
	
	public int getSideLength(){
		return  Length;
	}
	

}
