package src.Encapulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        EncapsuleClass1 encObj = new EncapsuleClass1();
        //encObj.getA();
        //encObj.getB();
        encObj.display();
        encObj.setA(200);
        encObj.setB(100);

        System.out.println(encObj.getA() + " "+ encObj.getB());

    }
    
}
