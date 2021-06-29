interface ip4{
    int a=10;
    String str="Interfaces";
}


public class InterfacePgm4 implements ip4{
    public static void main(String[] args) {
        System.out.println(ip4.a);//static variable is called with interface name which proves variables are static
        System.out.println(ip4.str);
       // ip4.a=20;cannot assign value as it is final
    }
}
