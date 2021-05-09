public class PolymorphismDemo {
void add(){
    System.out.println("Add method with no values");
}

long add(int a,int b){
    System.out.println("Add method with two integer values"+(a+b));
    return a+b;
}

void add(int a,float b){
    System.out.println("Add method with String and integer values"+(a+b));
}
void add(int a,String b){
    System.out.println("Add method with integer and String as parameters"+(a+b));
}
void add(int a, int b, int c){
    c=a+b;
    System.out.println("Add method with three integer values"+c);
}
    int x=80;
    long y= 20;
    long z=0;



    public static void main(String[] args) {
        PolymorphismDemo polyobj = new PolymorphismDemo();
       // polyobj.z=polyobj.x+polyobj.y;
        //System.out.println(polyobj.z);

        //polyobj.add();
        polyobj.add(5,10.5f);
        polyobj.z=polyobj.add(5,10);
        System.out.println(polyobj.z);
        //polyobj.add(25, 35, 0);
        //polyobj.add("10", 20);
        //polyobj.add(50, "60");
        
    }
    
}
