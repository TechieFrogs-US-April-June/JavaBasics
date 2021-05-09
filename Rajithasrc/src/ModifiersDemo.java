//class ClassA{
   // private int a=60;
    //void displaymethod(){
//System.out.println("private method");
   // }

//}

class ModifiersDemo {

    protected void displaay(){
        System.out.println("main method display");

    }
    public static void main(String[] args){

        //ClassA obja =new ClassA();
        //obja.displaymethod();
        ModifiersDemo mdobj2 = new ModifiersDemo();
        mdobj2.displaay();
        


    }


    
}
