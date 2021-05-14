package Methods;

public class AreaSample {

    public int Area(int length,int breadth){
        System.out.println("Area of Rectangle is   "+(length*breadth));
        return length*breadth;
    }
 
    public int Area(int side){
        System.out.println("Area of Square is   "+(side*side));
        return side*side;
    }

    public static void main(String[] args) {
        
        AreaSample asobj = new AreaSample();
        asobj.Area(5, 6);
        asobj.Area(4);
    }
    
}
