package assignments;

public class UnaryOperator {

	public static void main(String[] args) {
		int x = 10;
		
		System.out.println(x);
		/*System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);*/
		
		int a =10;
		int b= 20;

		//System.out.println(a++ + b++);//=20 instead 22
		System.out.println(++a + ++b);//=32 instead 30
		System.out.println(a);//11
		System.out.println(a++ + ++a);//11+13=24
		//System.out.println(a);
		

		//System.out.println(b);
	}

}
