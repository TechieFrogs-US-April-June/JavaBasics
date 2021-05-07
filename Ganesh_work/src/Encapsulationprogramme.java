class encapsulation {
  private int a=10;
  int b=200;

    public int getA() {
        return a;
    }

    public int setA(int a) {
        this.a = a;
        return a;
    }
    public void display()
    {
        System.out.println(a +" "+ b);
    }
}

public class EncapsulationPgm1 {

    public static void main(String[] args) {
        encapsulation encObj=new encapsulation();
        System.out.println(encObj.getA());
        System.out.println(encObj.setA(20));
        System.out.println(encObj.b);
       encObj.display();
       // System.out.println(encPgm2Obj.getA());


        EncapsulationPgm2 encPgm2Obj=new EncapsulationPgm2();
        encPgm2Obj.setA1(54785);
        System.out.println(encPgm2Obj.getA1());
    }
}