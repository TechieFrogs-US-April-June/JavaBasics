package ClassesandObjects;

class RectangleArea{
    
    int length,breadth;
RectangleArea(int l, int b){
        length = l;
        breadth = b;
}
public int setDim(){
int results = length * breadth;
return results;
}
 public void getArea(){
System.out.println("Area = " +  setDim());
}
public static void main(String []args){
RectangleArea x =new RectangleArea(6,5);
x.getArea();
        
    }
    
}

