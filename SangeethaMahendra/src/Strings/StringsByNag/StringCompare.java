package src.Strings.StringsByNag;

// STRING COMPARISON - BY EQUALS() METHOD COMPARES CASE AND STRING VALUES NOT MEMORY LOCATION

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin"); 
        String s4 = "Sachi";
        String s5 = "SACHIN";
        String s6 = "sachin";
        String s7 = "Soura";
        String s8 = "Mahen";
        String s9 = "Mahe";
        

        System.out.println("Compares s1 and s2  " + s1.equals(s2)); //OUTPUT TRUE
        System.out.println("Compares s1 and s3  " + s1.equals(s3)); //OUTPUT TRUE
        System.out.println("Compares s1 and s4  " + s1.equals(s4));  //OUTPUT FALSE
        System.out.println("Compares s1 and s5  " + s1.equals(s5));   //OUTPUT FALSE
        System.out.println("Compares s1 and s5 using egual ignore case  " + s1.equalsIgnoreCase(s5)); //IT IGNORES CASE SENSITIVE , OUTPUT FALSE
        System.out.println("Compares s1 and s6  " + s1.equals(s6)); // OUTPUT FALSE BECAUSE OF CASE SENSITIVE

        // STRING COMPARISON - BY USING == METHOD // IT COMPARE THE MEMORY LOCATION , VALUES , CASE SENSITIVE
 
        //THE BELOW OUTPUT IS TRUE BECUASE THESE TWO VARIABLES ARE SHARING SAME LOCATION THAT IS SCP
        System.out.println("Compares s1 and s2 using == method  " + s1 == s2); //OUTPUT TRUE

         //THE BELOW OUTPUT IS FALSE BECUASE THESE TWO VARIABLES ARE NOT SHARING SAME LOCATION ONE IN HEAP ONE IN SCP
        System.out.println("Compares s1 and s3 using == method   " + s1 == s3); 


        //STRING COMPARISON - BY USING compareTo() METHOD ; it compares Ascii codes too
        System.out.println("Compares s1 and s2 using compareTo method   " + s1.compareTo(s2)); 
        System.out.println("Compares s1 and s3 using == method   " + s1.compareTo(s3)); 
        System.out.println("Compares s1 and s4 using == method   " + s1.compareTo(s4));
        System.out.println("Compares s1 and s5 using == method   " + s1.compareTo(s5));  
        System.out.println("Compares s1 and s5 using == method   " + s1.compareToIgnoreCase(s5)); //Ignores case sensitive and compare
        System.out.println("Compares s1 and s6 using == method   " + s1.compareTo(s6));  
        System.out.println("Compares s8 and s9 using == method   " + s8.compareTo(s9)); 
        System.out.println("Compares s9 and s8 using == method   " + s9.compareTo(s8)); 


    } 
    
}
