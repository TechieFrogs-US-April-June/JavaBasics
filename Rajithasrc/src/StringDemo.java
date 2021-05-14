public class StringDemo {
    int no=5;

    static String name ="Techie";
    static String str = new String("My new String");
    static String fname= "Techie";

    public static void main(String[] args) {
        
        name= name.concat("Frogs");
        name= name+"my company";
        fname= fname.concat("Turtles");
        //String s1="Saah";
       // String s2="AA";
       // String s3="Aachin";
       //String s1="SachinTendulkar    ";
        //System.out.println(s2.compareToIgnoreCase(s3));
        //System.out.println(s1.compareTo(s2));
       //System.out.println(name+"    "+str+"    "+fname);
       //String s2=s1.substring(4);
      // String s2=s1.substring(0,6);
       //System.out.println(s2);
       //System.out.println(s2.toLowerCase());
       //System.out.println(s2.toUpperCase());
       //String s1="Sachin    ";
       //String s2="   Tendulkar   ";
      // String s2="    Tend  ulkar   ";//trim will work for start of the spaces and end of the spaces not in between the string spaces
       //System.out.println(s1+""+s2);
       //System.out.println(s1+s2);
       //System.out.println(s1.trim()+s2.trim());
       //String s1="Sachin   ";
       // s2="Tendulkar";
       //System.out.println(s1.startsWith("Ta"));
       //System.out.println((s1.trim()).endsWith("in"));
       //System.out.println(s1.trim().length());
       //System.out.println(s1.charAt(5));
        int x=10;
        String s2=String.valueOf(10);
        System.out.println(s2);
       // System.out.println(x+10);//here x+10 is 20+10  20 is integer value
        //System.out.println(s2+10);// here s2 is string "20"+10
        String s1="Sachin  ";
        //System.out.println(s1.replace("Sachinjnj", "Tendulkar"));
        s1=s1.replace("Sachin", "Tendulkar");
        System.out.println(s1);

      StringBuffer str1 = new StringBuffer();
      str1.append("Hi Team.This is our Batch.jjh");
      StringBuffer str = new StringBuffer("Welcome My Team");
      //str.append("  Team,How are you all. Hope all are good");
      //System.out.println(str.length());
      System.out.println("My capacity before is : "+str.capacity());
      str.ensureCapacity(20);
      System.out.println("My capacity after is : "+str.capacity());

      // str.insert(1,"Greetings");
      //str.replace(0,7, "Greetings");
      //str.deleteCharAt(0);
      //str.delete(0, 7);
      //str.reverse();
      
       StringBuilder strBuild = new StringBuilder("Welcome");
       strBuild.append("Team. Hope you all are good");
       System.out.println("My capacity before is : "+strBuild.capacity());
       System.out.println(str);

      
    }
    
}
