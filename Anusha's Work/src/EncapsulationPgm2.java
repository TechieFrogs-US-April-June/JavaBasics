public class EncapsulationPgm2 {
    private int a1=100;

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public static void main(String[] args) {
        encapsulation encPgm1Obj=new encapsulation();
        encPgm1Obj.setA(45487);
        encPgm1Obj.getA();
        System.out.println(encPgm1Obj.getA());
    }
}
