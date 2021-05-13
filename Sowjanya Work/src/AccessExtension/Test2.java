package AccessExtension;

import AccessModifiers.AccessModi;

public class Test2 {
    public static void main(String[] args) {

        //Creating object for AccessModi class from(AccessModifiers package) in another(AccessExtension) package
        AccessModi am = new AccessModi();
        System.out.println(am.num);
        System.out.println(am.value);

        //Can't access private,protected and default in another class in another package
        //System.out.println(am.sum);
        //System.out.println(am.name);
        //System.out.println(am.a);
        //System.out.println(am.c);
        //System.out.println(am.x);
        //System.out.println(am.mymsg);
    }

}
