package com.oops;

public class MethodOverriding1 {

	public static void main(String[] args) {
		/* when parent class reference refer to the parent class obj then in this
		 * case overridden method(method of parent class called)
		 */
		ABC obj1 = new ABC();
		obj1.disp();
		/* when parent class reference refer to the child class obj
		 * then in this case overriding method called(this is called child class method)
		 * this is called dynamic method dispatch and runtime polymorphism
		 */
		ABC obj2 = new Demo();
		obj2.disp();

	}

}
