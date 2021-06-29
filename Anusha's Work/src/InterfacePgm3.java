public class InterfacePgm3 extends InterfacePackage.InterfacePgm3 {
    void interfaceMethod1(){
        System.out.println("proving interface is public by accessing method 1 from different package and implementing where it extended");
    }
    void interfaceMethod2(){
        System.out.println("proving interface is public by accessing method 2 from different package and implementing where it extended");
    }
    void interfaceMethod3(){
        System.out.println("proving interface is public by accessing method 3 from different package and implementing where it extended");
    }
    public static void main(String[] args) {
        InterfacePgm3 interfacePgm3Obj=new InterfacePgm3();
        interfacePgm3Obj.interfaceMethod1();
        interfacePgm3Obj.interfaceMethod2();
        interfacePgm3Obj.interfaceMethod3();
        }
    }

