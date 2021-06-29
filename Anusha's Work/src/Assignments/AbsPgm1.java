package Assignments;
abstract class Animal{
    public abstract void sound();
}
public class AbsPgm1 extends Animal{
    public void sound(){
        System.out.println("Animal Method");
    }
    public static void main(String[] args) {
        Animal absPgm1obj=new AbsPgm1();
        absPgm1obj.sound();
    }
}
