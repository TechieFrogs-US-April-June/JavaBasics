public class InnerClass {
    int a;
    static int b;
    private int c;

    private class Inner_Class1{
        static final int x=5;
        int num;
        private int z=6;
        void display(){
        System.out.println("Inner_Class1 method num value-"+num+"a value-"+a+"b value-"+b+"c value-"+c);
        }
    }
    
    void displayInnnerClassContent(){
        Inner_Class1 innerClassObj1= new Inner_Class1();
      innerClassObj1.display();
    }

    public static void main(String[] args){
    InnerClass driverclassObj =new InnerClass();
    driverclassObj.a=10;
    InnerClass.b=600;
    InnerClass.Inner_Class1 innerClassObj2= driverclassObj.new Inner_Class1();
    innerClassObj2.num=67;
    innerClassObj2.display();
    driverclassObj.displayInnnerClassContent();
    }
}
