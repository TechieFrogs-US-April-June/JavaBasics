package ClassesandObjects;
class Triangle1 {
    int a,b,c;

    Triangle1(int x, int y,int z){
        a=x;
        b=y;
        c=z;
        System.out.println("Triangle constructor");
    }
    public double getArea(){
        double s= (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
        public double getPerimeter(){
            return(a+b+c)/2.0;
        }
   }
   class TriangleSample1{
       public static void main(String[] args){
           Triangle1 t1 = new Triangle1(3,4,5);
           System.out.println(t1.a+" "+t1.b+" "+t1.c);
        
           
           System.out.println(t1.getArea());
           System.out.println(t1.getPerimeter());
       }
    }