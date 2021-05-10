public class InheritanceDemo extends TestPattern {
    int x=100;
    String s="abc";
    //int a=100;

    void display(){
        System.out.println("In super class MyDisplay method"+this.a+" "+super.a);
    }
     
    static void showMsg(){
        System.out.println("In Inheritance Demo Class");

    
    }

    static public void myMsg(){
        System.out.println("InInheritance Demo class");
    }

    
   // void myDisplay(){
        //this.display();
//super.display();
   // }


    InheritanceDemo(){
        super(5,10);
        System.out.println("In Inheritance demo constructor");
        
        //System.out.println("In My child class constructor");
    }

    public static void main(String[] args) {
        InheritanceDemo childobj = new InheritanceDemo();
        
        System.out.println("In Sub class "+childobj.x+" "+childobj.s);
        childobj.myDisplay();
        childobj.display();
        InheritanceDemo.showMsg();
    }

    
}
