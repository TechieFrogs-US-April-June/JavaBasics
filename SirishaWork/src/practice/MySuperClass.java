package SirishaWork.src.practice;

public class MySuperClass {
    int a = 1000;
    float b = 500.53f;

    void  display(){
        System.out.println("In my super class method " +a +" "+b);
    }

    MySuperClass(){
        System.out.println("In my super class constructor");
    }

   // public static void main(String[] args) {
       // MySuperClass mySuperObj = new MySuperClass();
       // mySuperObj.display();
    }
