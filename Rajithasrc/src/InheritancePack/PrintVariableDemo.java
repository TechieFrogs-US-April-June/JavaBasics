package InheritancePack;

class Counter{
    public int i=3;
    public void increment(){
        System.out.println("Increment method of Counter Class");
    }
}
class Test extends Counter{
    
    public void increment(){
        
        
        System.out.println(" i =  "+i);

    }
}
public class PrintVariableDemo {
    
    
    public static void main(String[] args){
        Test tstObj=new Test();
        tstObj.increment();
    }
}
