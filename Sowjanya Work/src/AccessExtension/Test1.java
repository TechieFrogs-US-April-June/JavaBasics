package AccessExtension;

import AccessModifiers.AccessModi;

public class Test1 extends AccessModi {
    public static void main(String[] args) {

        //creating object for Test1 with extends(inherits) AccessModi class from other(AccessModifiers) package
        Test1 tObj = new Test1();

        System.out.println(tObj.num);
        System.out.println(tObj.value);
        System.out.println(tObj.x);
        System.out.println(tObj.mymsg);

        //can't access private and default in another subclass in another package
        //System.out.println(tObj.sum);
        //System.out.println(tObj.name);
        //System.out.println(tObj.a);
        //System.out.println(tObj.c);


    }

}
