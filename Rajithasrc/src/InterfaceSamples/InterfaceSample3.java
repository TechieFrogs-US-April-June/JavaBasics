package InterfaceSamples;
import InterfaceSamples.pack1.*;
import InterfaceSamples.pack2.TestInterFaceSample2;


public class InterfaceSample3 extends TestInterFaceSample2 {

    public void display3(){
        System.out.println("InterfaceSample3 class display from InterfaceSamples package");

    }
      
    TestInterface1 getInner(){
        return this.new InnerClassSample1();
    }
    
    public static void main(String[] args) {
        
        InterfaceSample3 infs3obj = new InterfaceSample3();
       
       System.out.println(infs3obj.getInner().display1());
    }
}
