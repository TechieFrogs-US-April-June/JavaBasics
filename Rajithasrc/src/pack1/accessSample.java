  class accessSample extends ModifiersDemo {

      void printdisplay(){
    
    System.out.println("Default display");
      }

      public static void main(String[] args){
          accessSample asobj= new accessSample();
          asobj.displaay();
          //asobj.printdisplay();
       // ModifiersDemo mdobj1 = new ModifiersDemo();
       // mdobj1.displaay();
      }
    
}
