public class Triangle {
    int a,b,c;
    Triangle() {
         a = 3; b = 4; c = 5;
         System.out.println("In Default Constructor");
    }
    Triangle(int a1,int b1,int c1) {
        a=a1;
        b=b1;
        c=c1;
        System.out.println("In Parameterized Constructor");
    }
    void areaoftriangle(){
        int s=(a+b+c)/2;//s=12/2,s=6
        double area=  Math.sqrt(s*(s-a)*(s-b)*(s-c));//sqrt of(6*3*2*1)=sqrt(36),   area=6
        System.out.println("Area of Triangle is:"+area);

    }
    void perimeteroftriangle(){
       int perimeter=a+b+c;//3+4+5=12
        System.out.println("Perimeter of Triangle is:"+perimeter);

    }
    public static void main(String[] args) {

        //with default constructor
        Triangle triObj=new Triangle();//creating an object
        triObj.areaoftriangle();
        triObj.perimeteroftriangle();
        System.out.println("--------------------------------");
        //with Parameterized constructor
        Triangle triObj2=new Triangle(3,4,5);
        triObj2.areaoftriangle();
        triObj2.perimeteroftriangle();
    }
}
