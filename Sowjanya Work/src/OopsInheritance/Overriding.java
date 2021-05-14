package OopsInheritance;

class Dog {
    public void bark() {
        System.out.println("woof");
    }
}
class GermanShepard extends Dog {
    //Override(should have same method name and same parameters)
    public void bark() {
      System.out.println("woof woof woof");
      //super.bark();
   }
}
public class Overriding {

    public static void main(String[] args) {
        GermanShepard gerObj = new GermanShepard();
        gerObj.bark();
    }

}
