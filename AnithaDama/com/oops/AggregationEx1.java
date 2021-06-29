package com.oops;

public class AggregationEx1 {

	public static void main(String[] args) {
		Address ad1 = new Address(20,"collierville","tennesse");
		Address ad2 = new Address(30,"germontown","Nebraska");
		StudentInfo s1= new StudentInfo(101,"Devika",ad1);
		System.out.println(s1.Sno+" " +s1.Sname+ " " +s1.StuAddr.StreetNo +" " +s1.StuAddr.city+" " +s1.StuAddr.State);
		College c1= new College("Hi-Tech",ad2);
		System.out.println(c1.CollName+" " + c1.CollAddr.StreetNo+ " " +c1.CollAddr.StreetNo+" " +c1.CollAddr.State+" " +c1.CollAddr.city);
		

	}

}
 