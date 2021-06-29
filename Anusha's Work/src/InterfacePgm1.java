interface RegularPolygon {
    int getNumSides();
    int getSideLength();

}

class EquilateralTriangle implements RegularPolygon{
    int b;
    EquilateralTriangle(int b){
        this.b=b;
    }
    public int getNumSides(){

        return 3;
        }
    public int getSideLength(){

        return b;
        }
    int totalSides(){
        int TotalSum=getNumSides()*getSideLength();
        return TotalSum;
    }
    int getPerimeter(){
       int perimeter=getSideLength()*getNumSides();
       return perimeter;
    }
    double getInteriorAngle(){
        double interiorangle=((getNumSides()-2)*Math.PI)/getNumSides();
        return interiorangle;
    }
}
class Square01 implements RegularPolygon{
    int s;
    Square01(int s){
        this.s=s;
    }
    public int getNumSides(){
        return 4;
    }
    public int getSideLength(){

        return s;
    }
}
public class InterfacePgm1 {
    public static void main(String[] args) {

    }
}
