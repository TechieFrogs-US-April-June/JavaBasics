package assignments;

public class LogicalAnd {

	public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b && a<c);//false &&  = false-- Only first one excecuted(Logical-&&)
		System.out.println(a<b & a<c);//false & true = false --excecutes both(Bitwise-&) 
		

	}

}
