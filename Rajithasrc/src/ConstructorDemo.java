public class ConstructorDemo {
    int a,b,c;
    float d;
    String s;
    
    ConstructorDemo(){
        this(20,30);
        a=2;
        b=3;
        c=6;
        System.out.println("1st one");
        
    }
    public ConstructorDemo(int x,int y){
        this(x,y,50,30.6f,"rajitha");
        a=x;
        b=y;
        System.out.println("Parameters-2");
    }
    private ConstructorDemo(int x1,int y1,int z1){
        this(4,3,2,78.9f);
        a=x1;
        b=y1;
        c=z1;
        System.out.println("Parameters -3");
    }
    protected ConstructorDemo(int x,int y,int z,float e){
        this();
        a=x;
        b=y;
        c=z;
        d=e;
        System.out.println("parameters - 4");
    }
    ConstructorDemo(int x,int y,int z,float e,String f){
        a=x;
        b=y;
        c=z;
        d=e;
        s=f;
       System.out.println("paramters -5");
    }
      static class StaticInnerClass1{
         
        private int r1=100;
        static int s1=100;
        void display4(){
            System.out.println("sum of r1 and s1 is :"+(r1+s1));
        }
       public static void main(String[] args){
           System.out.println("StaticinnerClass1 main");
       }
 
       
    }

    private class InnerClass2{
        static final int z2=40;
        int x2=10;
        private int y2=60;
        void display3(){
            System.out.println("value of z2 "+z2+"value is x2 is"+x2+" value of y2 is "+y2 );


        }
    }

        void displayInnerClassmethod(){
            InnerClass2 innerClass2Obj= new InnerClass2();
            innerClass2Obj.display3();
        }
    
    public static void main(String[] args){
        ConstructorDemo constructDemoObj= new ConstructorDemo();
        System.out.println(constructDemoObj.a+" "+constructDemoObj.b+" "+constructDemoObj.c);

      // ConstructorDemo constructDemoObj1= new ConstructorDemo();
      // System.out.println(constructDemoObj1.a+" "+constructDemoObj1.b+" "+constructDemoObj1.c);

        //ConstructorDemo constructDemoObj2= new ConstructorDemo(10,20);
       // System.out.println(constructDemoObj2.a+" "+constructDemoObj2.b);

        //ConstructorDemo constructDemoObj3= new ConstructorDemo(30,40,50);
        //System.out.println(constructDemoObj3.a+" "+constructDemoObj3.b+" "+constructDemoObj3.c);

        //ConstructorDemo constructDemoObj4= new ConstructorDemo(60,30,80,70.5f);
        //System.out.println(constructDemoObj4.a+" "+constructDemoObj4.b+" "+constructDemoObj4.c+" "+constructDemoObj4.d);

        //ConstructorDemo constructDemoObj5= new ConstructorDemo(45,55,34,34.6f,"name");
        //System.out.println(constructDemoObj5.a+" "+constructDemoObj5.b+" "+constructDemoObj5.c+" "+constructDemoObj5.d+" "+constructDemoObj5.s);
         
        ConstructorDemo.StaticInnerClass1 staticInnerClassObj= new ConstructorDemo.StaticInnerClass1();
        System.out.println(staticInnerClassObj.r1);
        staticInnerClassObj.display4();


        ConstructorDemo.InnerClass2 innerClass2Obj2 = constructDemoObj.new InnerClass2();
        innerClass2Obj2.x2=70;
        innerClass2Obj2.display3();

        constructDemoObj.displayInnerClassmethod();

        TestObject1 tstObj1 =new TestObject1();
        tstObj1.display1();;

        TestObject2 tstObj2 = new TestObject2();
        tstObj2.display2();
    }
    
}
