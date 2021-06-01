package src.Strings;

public class ConvertCharToString {
    public static void main(String[] args) {
        //CONVERTS CHAR  INTO STRING
        //String class contains one constructor which takes char-array as input and convert into String

        char ch[] = {'A','n','u'};
        String s = new String(ch); //To convert place the cursor inside String constructor (), click ctrl+space; select string(char(value))
        System.out.println(ch); //It converts char to String 

        //CONVERTS STRING INTO CHAR
        String st = new String("Anu");
        char[] cha = st.toCharArray(); // using ToCharArray
        for(char t:cha)
        {
         System.out.println(t);
        }
        
       // STRING LENGTH WITHOUT USING PRE-DEFINED METHOD(LENGTH))
       String str = new String("Anu");
        char[] ch1 = st.toCharArray();
        int len=0;
        for(char temp:ch1)
        {
            len++;
        }
        System.out.println(len);

        //REVERSE STRING 
        // step 1 : change string into char value
        String s1 = new String("Anusha");
        char[] c1 = s1.toCharArray(); //Converts into char 
        //Step 2: take dummy variable
        String rev = ""; 
        for(int i = c1.length-1;i>=0;i--)
        {
           rev = rev+c1[i];
        }
        System.out.println(rev);

        

    }
}
