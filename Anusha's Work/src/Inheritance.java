 class Parent{
      void displayParent() {
        System.out.println("This is Parent class");
    }

}

class Child extends Parent{

    void displayChild(){
        System.out.println("This is Child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent parentObj=new Parent();
        Child childObj=new Child();
        parentObj.displayParent();
        childObj.displayChild();
        childObj.displayParent();

    }
}
