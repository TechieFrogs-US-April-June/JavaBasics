public class MethodsDemo{ 

    int a,b;
     

    public int displaysum(int x,int y){
        System.out.println("method display");
        a=x;
        b=y;
        int c =a+b;
        //return c;
        return a+b;

    }

    public static void main(String[] args) {
        MethodsDemo methodsDemoObj = new MethodsDemo();
         int d = methodsDemoObj.displaysum(50,60);
        System.out.println("main method display");
        System.out.println(d);
    }



}