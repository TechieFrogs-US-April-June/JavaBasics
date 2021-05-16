package com.Methods;

class Degree1 {
	
	void getDegree()
	{
		System.out.println("I got Degree");
	}
	
	
	class Undergraduate extends Degree1{
		
		void getDegree()
		{
			System.out.println("I am an Undergraduate");
		}
	}
	
	class Postgraduate extends Degree1{
		
		void getDegree()
		{
			System.out.println("I am an Postgraduate");
		}
	}

	class Degree{
		
	
	void main(String[] args) {
		Undergraduate u = new Undergraduate();
		u.getDegree();
		Postgraduate p = new Postgraduate();
		p.getDegree();
		
	}
	}
}