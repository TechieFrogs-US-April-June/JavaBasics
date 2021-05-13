package src.InheritanceExercises.Rectangle;

public class SquareArray extends RectangleArray{

    //Constructor for SquareArray
    public SquareArray(int len, int bre) {
        super(len, bre); // inherits from RectangleArray(base/parent class) 
        
    }

    public static void main(String[] args) {

         //print the area of 10 squares Using array of objects    
        SquareArray[] arrObj = new SquareArray[10]; // creating objects for array
        arrObj[0] = new SquareArray(11,8); // gave parameters
        arrObj[1] = new  SquareArray(17,36);
        arrObj[2] = new  SquareArray(6,4);
        arrObj[3] = new  SquareArray(5,8);
        arrObj[4] = new  SquareArray(12,24);
        arrObj[5] = new  SquareArray(5,13);
        arrObj[6] = new  SquareArray(3,7);
        arrObj[7] = new  SquareArray(9,11);
        arrObj[8] = new  SquareArray(9,16);
        arrObj[9] = new  SquareArray(3,5);

         //Object for Method
      //   SquareArray squObj = new SquareArray(5,8);
        // squObj.area();
         //squObj.perimeter();
        
    
        
        
    }
    
}
