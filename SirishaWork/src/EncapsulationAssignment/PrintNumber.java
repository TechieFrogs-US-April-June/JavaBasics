package SirishaWork.src.EncapsulationAssignment;

public class PrintNumber {

        public int print(int a){
            System.out.println(a);
            return a;
        }
        public float print(float b){
            System.out.println(b);
            return b;
        }
        public double print(double c){
            System.out.println(c);
            return c;

        }
        public String print(String d){
            System.out.println(d);
            return d;
        }

        public static void main(String[] args) {

            //PrintNumber a = new PrintNumber ();
            PrintNumber objb = new PrintNumber ();
            objb.print("sirisha");
           // b.print(1.55);
            //b.print(0.56567);
            //b.print(45);

        }
}
