package SirishaWork.src.MethodAssignment;

public class SquareRectangleArea {
//Overloaded area () function
    //method overloading
        public void Area(int l, int b)
        {
            int A = l * b;
            System.out.println("Area of Rectangle: "+ A);
        }
        public void Area(int s)
        {
            int A = s/4;
            System.out.println("Area of Square: "+ A);

        }
    }
    class SRA
    {
        //Driver code
        public static void main(String args[])
        {
            //Creating object main class
           SquareRectangleArea obj1 = new SquareRectangleArea();
           //calling function
           obj1.Area(50,40);
           obj1.Area(30);

        }
    }

