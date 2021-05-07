class OuterClass{
//public class StaticNestedClass {
    static int i=10;
    private int x=15;

    static class NestedClass{
        int a1=5;
        private int b1=10;
        static int y=100;

        void display(){
            a1=10;
            b1=20;
            i=80;
            System.out.println("values are  i="+i+"a1="+a1+"b1="+b1+"y value"+y);
        }
        public static void main(String[] args){
            System.out.println("Static inner class main");
        }
    }
   /* public static void main(String[] args){
    StaticNestedClass.NestedClass nestedObj= new StaticNestedClass.NestedClass();
    System.out.println(nestedObj.b1);
    nestedObj.display();
    } */
    
        
    
    
}
public class StaticNestedClass{
    public static void main(String[] args){
        OuterClass.NestedClass nestedObj= new OuterClass.NestedClass();
        nestedObj.display();
    }
}
