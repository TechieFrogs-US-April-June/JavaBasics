public class MultilevelInheritanceDem extends InheritanceDemo {
    String myName="Java Developer";

    static void showMsg(){
        System.out.println("In Multilevel Inheritance Demo class");
    }
    void display(){
        System.out.println("In child class MyDisplay method"+this.a+" "+super.a);
        super.display();
    }

    public void display(InheritanceDemo inheritobj){
        System.out.println(inheritobj.a+" "+inheritobj.b);
        
    }
    MultilevelInheritanceDem(){
        System.out.println("In Multilevel constructor");
    }
    public static void main(String[] args) {
        MultilevelInheritanceDem multiObj = new MultilevelInheritanceDem();
        //multiObj.showMsg();
        multiObj.display();
        multiObj.display(multiObj);
        //multiObj.myDisplay();
        //InheritanceDemo.myMsg();
       // multiObj.myMsg();
    }
}
