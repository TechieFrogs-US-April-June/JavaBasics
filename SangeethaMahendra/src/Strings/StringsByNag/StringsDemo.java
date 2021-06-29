package src.Strings.StringsByNag;

public class StringsDemo {
        //THERE ARE 2 WAYS TO CREATE STRING
    int no = 5;
             
  //  Integer number = new Integer(); // Wrapper class of primitive data types

     //<String Type>  <String Variable = identifiers> = <"Sequence of Strings">
        // String        name                           =  "Techie"  ;   

       static  String name ="Techie";  // STRING LITERAL ; THIS ONE CREATES TWO OBJECTS ONE IN HEAP AND ONE IN SCP(STRING CONSTANT POOL)
        static String fname = "Techie"; // IT CHECKS IF SAME OBJECT IS EXISTS IN SCP, IF DOES THEN IT POINTS(REFERENCE) THE EXISTING OBJECT THAT IS SCP ((shares same memory location)
        static String newName; 
      // String Class
       static  String str = new String("My New String"); // CREATE OBJECT USING NEW KEYWORD //CREATES 2  OBJECTS ONE IN HEAP AND 1 IN SCP AND POINTS REFERENCE TO HEAP MEMORY.

       //CREATE STRING USING CHAR 
         static char ch[] = {'J','a','v','a'};
        static  String s1 = new String(ch);
    
    
    public static void main(String[] args) {

      System.out.println(name + " "+ str);
        
        // STRING IS IMMUTABLE. THE VALUE CANNOT BE CHANGED ONCE CREATED USING STRING LITERAL 
         name.concat("Frogs");  
         // BUT WE CAN ASSIGN THE OBJECT IN MEMORY LOCATION WITH USING NEW VARIABLE eg below. THIS WILL CREATE NEW OBJECT
         fname = fname.concat(" Turtules");
          newName = fname.concat(" Turtules");
         System.out.println(name + " "+ str); //OUTPUT Techie My New StrinG

         System.out.println(name + " "+ str+ " "+ fname); //OUTPUT Techie My New String Techie. FNAME SHARES SAME MEMORY LOCATION; SO WONT ACCEPT TURTULES
         System.out.println(newName);
         System.out.println("CREATE STRING USING CHAR ====> " + s1);
    }
    
}
