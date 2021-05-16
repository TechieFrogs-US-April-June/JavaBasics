package com.BasicSamples;

public class ArmStrong16 {
	static int i = 370, j, temp, total = 0;

	public static void main(String[] args) {
	    
	        j = i;
	        while (j != 0)
	        {
	            temp = j % 10;
	            total = total + temp*temp*temp;
	            j /= 10;
	        }

	        if(total == i)
	            System.out.println(i + " is an Armstrong number");
	        else
	            System.out.println(i + " is not an Armstrong number");
	    }
	
	}


