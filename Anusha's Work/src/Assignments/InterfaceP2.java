package Assignments;
interface interfacepgm2{
    public void methodM1();
    public void methodM2();

}

class interfaceP2 implements interfacepgm2{

    public void methodM1() {
        System.out.println("Method 1 IMplementation");
    }
    public void methodM2() {
        System.out.println("Method 2 IMplementation");

    }
    public static void main(String[] args) {
        interfacepgm2 interObj=new interfaceP2();
        interObj.methodM1();
        interObj.methodM1();
    }


}
