class add{
    void addInt() {
        int a = 10, b=20;
        System.out.println(" Printing from add class:"+ (a + b));
    }
    void display()
    {
        System.out.println("In Adding two Integers Method");
    }

}
class Sub extends add {
    void subInt() {
        int a = 100, b =50;
        System.out.println(" Printing from Sub class:"+ (a - b));
    }

    void displaySub() {
        System.out.println("In Subtracting two Integers Method");
    }
}
class Mul extends Sub{
    void MulInt() {
        int a=10,b=5;
        System.out.println(" Printing from Mul class:"+ (a * b));
    }
}


public class OperationsInheritance {
    public static void main(String[] args) {
       /* Sub subObj=new Sub();
        subObj.addInt();//10+20=30
        subObj.subInt();//100-50=50
        subObj.displaySub();*/

        Mul mulObj=new Mul();
        mulObj.MulInt();//10*5=50
        mulObj.subInt();
        mulObj.addInt();
        mulObj.display();




    }
}
