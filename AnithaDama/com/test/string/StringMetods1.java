package com.test.string;

public class StringMetods1 {
	String s = "Devika";
	public void startwith()
	{
		//String s = "Devika";
		boolean flag = s.startsWith("Deva");
		System.out.println(flag);
	}
	public void endswith()
	{
		boolean flag = s.endsWith("ka");
		System.out.println(flag);
	}
	public void codepointAt()                   //codepointAt()
	{
		int codeValue = s.codePointAt(0);
		System.out.println(codeValue);
	}
	public void codePointBefore()
	{
		int codeValue = s.codePointBefore(2);
		System.out.println(codeValue);
	}
	public void contains()
	{
		boolean flag = s.contains("vi");
		if(flag)
		{
			System.out.println(" given sequence is exist");
		}
		else
		{
			System.out.println(" given sequence is not exist");
		}
	}
	public void contentEquals()
	{
		boolean flag = s.contentEquals("Devika");
		System.out.println(flag);
	}
	public void getBytes()
	{
		byte[] by = s.getBytes();
		for(byte b:by)
		{
			System.out.println(b);
		}
	}
	public void getclass()
	{
		System.out.println(s.getClass().getName());
	}
	public void isEmpty()
	{
	boolean flag = s.isEmpty();
	if(flag)
	{
		System.out.println("is empty");
	}
	else
	{
		System.out.println(" not empty ");
	}
	}
public void compareTo()
{
	String s1 = "Devika";
	String s2 = "devika";
	int result = s.compareTo(s1);
	System.out.println(result);
	int res = s.compareTo(s2);
	System.out.println(res);
	
}
public void intern()
{
	String s3 = new String("elephant");
	String s4 = s3.intern();
	System.out.println(s3.equals(s4));
}


}
