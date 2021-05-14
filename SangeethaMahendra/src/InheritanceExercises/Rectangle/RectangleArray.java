package src.InheritanceExercises.Rectangle;

public class RectangleArray {

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
    public RectangleArray(int len, int bre)
    {
      //System.out.println("Print the Area and Perimeter of the rectangle");
        length = len;
         breadth = bre;
      int area = len * bre;
      int Perimeter = 2*(len+bre);
       System.out.println("Print the Area of the rectangle : " + area);
       System.out.println("Print the Perimeter of the rectangle : " + Perimeter);
    }
     

    


    public static void main(String[] args) {

        //print the area of 10 squares Using array of objects

        RectangleArray[] arr = new RectangleArray[10]; // creating objects for array
        arr[0] = new RectangleArray(6,8); 
        arr[1] = new RectangleArray(9,6);
        arr[2] = new RectangleArray(7,4);
        arr[3] = new RectangleArray(3,8);
        arr[4] = new RectangleArray(12,18);
        arr[5] = new RectangleArray(45,90);
        arr[6] = new RectangleArray(11,19);
        arr[7] = new RectangleArray(19,27);
        arr[8] = new RectangleArray(4,8);
        arr[9] = new RectangleArray(2,4);

        //Object for Method
        RectangleArray recObj = new RectangleArray(5,8);
        recObj.area();
        recObj.perimeter();
       

    }

   
    
}
