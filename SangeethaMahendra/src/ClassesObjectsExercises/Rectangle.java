package src.ClassesObjectsExercises;

//Q5: print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.

public class Rectangle {
    //Declaring Instance Variables
     int length;
     int breadth;
     int area;

    // Method for area
    void area(){
         area = length * breadth; //method named 'Area' which returns the area 
         System.out.println(" Print the area of the rectangle : " + area);
     }

     Rectangle( int len, int bre){
        length = len;
        breadth = bre;
     }

}

class Rec{
    public static void main(String[] args) {
        Rectangle recObj = new Rectangle(4,5); //length and breadth passed as parameters to its constructor.
        recObj.area();
      //  System.out.println("\n");


        Rectangle recObj1 = new Rectangle(5,8); //length and breadth passed as parameters to its constructor.
        recObj1.area();


        
        
        
    }


}
