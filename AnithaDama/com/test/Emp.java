package com.test;

public class Emp {

		int eno;
		String ename;
		String dept;
		public Emp(int eno, String ename, String dept) {
			
			this.eno = eno;
			this.ename = ename;
			this.dept = dept;
		}
		
		 public boolean equals(Object obj) {
		        boolean flag = false;
		        Emp e1 = (Emp)obj;
		        if(this.eno==e1.eno && this.ename.equals(e1.ename) && this.dept.equals(e1.dept))
		        {
		        	flag = true;
		        }
		        else {
		        	flag = false;
		        	
		    }
		        return flag;
	}

}