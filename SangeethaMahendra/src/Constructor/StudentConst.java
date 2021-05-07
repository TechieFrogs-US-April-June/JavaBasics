package src.Constructor;

public class StudentConst {
    int id,age;
    float id1;
    String name ;
    String str = "nila";


    StudentConst(int i , String n){ //PARAMETERIZED CONSTRUCTOR
     id = 8; 
     name = "Hello"; 
     id =i;
     name = n;  
     // System.out.println("id value is " + id + " " + "Name Value is " + name);
      //System.out.println("id value is " + i + " " + "Name Value is " + n);
    }

    StudentConst( float ii, String nn){  //Duplicate Constructor means should not have same data types
     id1 = ii;
     name = nn;
     System.out.println("id value is " + ii + " " + "Name Value is " + nn);
    
    }
    
    StudentConst(int i , String n, int a){ //PARAMETERIZED CONSTRUCTOR
        id = i; 
        name = n; 
        age = a;  
        // System.out.println("id value is " + id + " " + "Name Value is " + name);
         //System.out.println("id value is " + i + " " + "Name Value is " + n);
       }

    StudentConst(String str1){  //Duplicate Constructor means should not have same data types
        //str = "Nila";
        name = str1;
        System.out.println(" String Value is " + str1);    
       }

       
      // void display(){
         //  System.out.println("Identification:  " + id + " "+ "Name: "+" "+ name + "Age: "+ " "+ age); // ? why
    //   }

public static void main(String[] args) {
    //StudentConst s1 = new StudentConst(111,"Karan"); //output : id value is 111 Name Value is Karan [Executes i and n value]
   // StudentConst s2 = new StudentConst(222, "Aryan");
  // StudentConst s3 = new StudentConst(222, "Aryan",25); //output: id value is 222 Name Value is Aryan [Executes i and n value]
  //  StudentConst s4 = new StudentConst(22.29f, "Aryan");
    StudentConst s5 = new StudentConst("Mayan");
  //  s1.display();
    //s3.display();


   // System.out.println("id value  " + s1.id + " " + "Name Value  " +s1.name); //output: id value is 8 Name Value is Hello 
    //System.out.println("id value  " + s2.id1 + " " + "Name Value  " +s2.name); 
    System.out.println(" String Value  " +s5.str + " " + "also Name Value " + s5.name); 
    
}
}
