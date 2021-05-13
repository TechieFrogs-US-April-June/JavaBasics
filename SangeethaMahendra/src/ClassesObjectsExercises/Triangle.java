package src.ClassesObjectsExercises;

//Question 3: print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
//Question 4: print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
public class Triangle {
  //Declaring Variables
   int sideA, sideB,sideC,perimeter;
   double area; 

   // Q3 : Initializing variables inside defaut Constructor
  public Triangle() {
     sideA = 3;
     sideB = 4;
     sideC = 5;
     System.out.println("In Default Constructor");
 //   System.out.println("Print the Area and Perimeter of the rectangle : " + area + " " + perimeter);

  }

  // Q4 : Constructor having the three sides as its parameters.
  public Triangle(int a, int b, int c){
      //  i did initialized the variables in parameter constructor in main method. So it will call this constructor (Correct)
       sideA = a;
       sideB = b;
       sideC = c;

      // i didn't initialized the variables in parameter constructor in main method. So it will not call this constructor (wrong)
      // a = sideA; 
      // b = sideB;
      // c = sideC;
      System.out.println("In Parameterized Constructor");



  }

  //Logic inside Methods
  public void a() { //
    int s = (sideA * sideB) / 2;
    area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)); // sqrt of(6*3*2*1)=sqrt(36),   area=6
    System.out.println("Print the Area  : " + area);


  }

  public void p() {
    perimeter = sideA + sideB + sideC; //3+4+5=12
    System.out.println("Print the Perimeter of the rectangle : " + perimeter);
  }

}

class Driver {
  public static void main(String[] args) {
    Triangle triObj = new Triangle();
    triObj.a();
    triObj.p();
    System.out.println("\n");


    Triangle triObj1 = new Triangle(3,4,5);
    triObj1.a();
    triObj1.p();
   

  }
}
