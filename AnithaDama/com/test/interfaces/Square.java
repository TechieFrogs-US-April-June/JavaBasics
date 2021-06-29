package com.test.interfaces;

public class Square implements RegularPolygon {
	private int Length;

	Square(int Length) {
		this.Length=Length;

	}

	@Override
	public int getNumSides() {
		return 4;
	}

	public int getSideLength() {
		return Length;
	}

}
