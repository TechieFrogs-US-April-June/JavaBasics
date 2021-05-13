package src.ClassesObjectsExercises;

//Q1 :Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 

public class Student {
  //Create a String variable 'name' and integer variable 'roll_no'
  String name;
  int roll_no;
   long phoneNumber;
  String Address;


  //Q2. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
  //Other way 
 /* void d(String name,int roll_no, long phoneNumber, String Address){
      this.name =name;
      this.roll_no = roll_no;
      this.phoneNumber = phoneNumber;
      this.Address = Address;
      //check the main method for method d
  }*/


void display(){
    System.out.println("Name: "+ name +"\n"+ "Roll_no: " + roll_no +"\n" + "Phone Number: " + phoneNumber +"\n" + "Address: "+ Address +"\n");
}



    public static void main(String[] args) {

        Student stuObj = new Student();
        stuObj.name = "Sam";
        stuObj.roll_no = 2;
        stuObj.phoneNumber = 765894302;
        stuObj.Address ="2,Bond park Dr";

//Q2. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
        Student studObj = new Student();
        studObj.name ="John";
        studObj.roll_no = 7;
        studObj.phoneNumber = 234567890;
        studObj.Address ="10,Newyork Street";
      //   stuObj.display();

       // System.out.println("Student Name : " + stuObj.name); //q1 Ans
        //System.out.println("Student Roll_no : " + stuObj.roll_no); //q1 Ans

        //Q2 Ans Below
        System.out.println("Name: "+ stuObj.name +"\n"+ "Roll_no: " + stuObj.roll_no +"\n" + "Phone Number: " + stuObj.phoneNumber +"\n" + "Address: "+ stuObj.Address  +"\n");
        System.out.println("Name: "+ studObj.name +"\n"+ "Roll_no: " + studObj.roll_no +"\n" + "Phone Number: " + studObj.phoneNumber +"\n" + "Address: "+ studObj.Address  +"\n");

       /*//Other way using method with parameters 
       stuObj.d("Sam", 6, 6754893240l , "5, Wake County" );
        studObj.d("John", 8, 7890987654l , "45,Milss park dr");
        stuObj.display();
        studObj.display();*/
    
    
        
    }
}
