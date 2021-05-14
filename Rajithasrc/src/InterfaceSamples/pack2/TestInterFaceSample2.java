package InterfaceSamples.pack2;
import InterfaceSamples.pack1.*;


public class TestInterFaceSample2 {
    
    protected class InnerClassSample1 implements TestInterface1{

       public InnerClassSample1(){

        }

         public String display1(){
             return "overriding TestInterface1 display from package pack1";
         }
         
        public void display2(){
            System.out.println("display2 of InnerClassSample1 in package pack2");
        }

    }
}
