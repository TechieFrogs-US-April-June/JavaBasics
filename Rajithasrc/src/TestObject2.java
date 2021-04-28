public class TestObject2 {
 int x=60;
 int y=50;

    void display2(){
System.out.println(x+y);
    }
    public static void main(String[] args){
        TestObject2 tstObj2=new TestObject2();
        tstObj2.display2();
        TestObject1 tstObj3=new TestObject1();
        tstObj3.display1();

    }
    
}
