package SirishaWork.src.java.practice;

public class InheritanceDemo extends MySuperClass {
    int x = 400;
    String name = "Techie";
    int a = 100;

    void myDisplay(){
        System.out.println("In child class my display method"+this.a+" "+super.a);
    }

    //InheritanceDemo(){
        //super();
       // System.out.println("In my child class constructor");
   // }
    public static void main(String[] args) {
        InheritanceDemo childObj = new InheritanceDemo();
        System.out.println("In subclass " +childObj.x+" "+childObj.name+" "+childObj.b);
        //childObj.myDisplay();
        childObj.display();
    }
}
