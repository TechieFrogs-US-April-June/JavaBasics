package SirishaWork.src.practice;

public class Constructor1 {
        int a, b;//data member
        float c;
        String username;

//using constructor we are initializing the values and constructor comes into picture only when object is created
        Constructor1(){//default constructor will take care of the default values "0" if we don't initialize values
            //this(5,10);//one should not have "this" in atleast one of the constructor
            System.out.println("Default");
            a = 5;
            b = 10;
        }
        Constructor1(int x, int y){//creating parameterized constructor
            this(x, y, "name");
            System.out.println("Parametered 1");
            a = x;
            b = y;
        }
        Constructor1(int x, float y){
            this();
            System.out.println("Parametered 2 "+y);
            a = x;
            c = y;
        }
        Constructor1(int x, int y, String name){
         this(x,4.5f);
        System.out.println("Parametered 3 ");
        a = x;
        b = y;
        username = name;
    }
    public static void main(String[] args) {
            //"New" key will takecare of the memory allocation and object creation
        //creating objects and parsing values
        Constructor1 contructor1obj = new Constructor1(10,20);//Constructor is the member of a function
        System.out.println(contructor1obj.a+" "+ contructor1obj.b);

      //  Constructor1 contructor1obj1 = new Constructor1(10,20);
       // System.out.println(contructor1obj1.a+" "+ contructor1obj1.b);

       // Constructor1 contructor1obj2 = new Constructor1(30,40.5f);
       // System.out.println(contructor1obj2.a+" "+ contructor1obj2.c);

       // Constructor1 contructor1obj3 = new Constructor1(30, 40, "sirisha");
       // System.out.println(contructor1obj3.a+" "+ contructor1obj3.b+" "+ contructor1obj3.username);
    }
}

