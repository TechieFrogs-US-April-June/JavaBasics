package com.oops.inheritance;

public class Teacher1 {
	private String Designation = "Teacher";
	private String CollegeName = "VJIT";
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	void does()
	{
		System.out.println("Teaching");
	}

}
class MusicTeacher extends Teacher1
{
	String Subject = "Music";
}
