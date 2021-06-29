package Assignments;
 class Super2{
    public void displaySuper() {
        System.out.println("Displaying from Super class");
    }
}
class Child1 extends Super2{
     public void displayChild1(){
         System.out.println("Displaying from Child1 class");
     }

}

public class Super1 extends Child1{
    public static void main(String[] args) {
        Child1 childObj=new Child1();
        childObj.displayChild1();
        childObj.displaySuper();
    }
}
