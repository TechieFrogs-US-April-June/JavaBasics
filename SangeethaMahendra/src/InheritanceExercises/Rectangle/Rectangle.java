package src.InheritanceExercises.Rectangle;

public class Rectangle {
    //Declaring Instance Variables
    int length;
    int breadth;
    int a;
    int p;
    //int a = length * breadth;
   // int p = 2*(length+breadth);
     
    

      // Method for area
    void area(){
       a = length * breadth;
        System.out.println(" Print the area of the rectangle : " + a);
    }
    
     // Method for Perimeter
    void perimeter(){
        p = 2*(length+breadth);
        System.out.println(" Print the perimeter of the rectangle :  " + p );
    }
   
    // Parameter Constructor
    public Rectangle(int len, int bre)
    {
      //System.out.println("Print the Area and Perimeter of the rectangle");
        length = len;
         breadth = bre;
      int area = len * bre;
      int Perimeter = 2*(len+bre);
       System.out.println("Print the Area and Perimeter of the rectangle : " + area + " " + Perimeter);
    }
     

    


    public static void main(String[] args) {
        Rectangle recObj = new Rectangle(5,8);
        recObj.area();
        recObj.perimeter();
       

    }

}
