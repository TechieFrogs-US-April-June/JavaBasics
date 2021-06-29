import java.util.StringTokenizer;

public class StringAssignment {
    public static void main(String[] args) {
        revOfString();
        palindromeOfString();
        replaceString();
        toUpperCase();
        toLowerCase();
        sortOfString();
        frstOccurenceInString();
        lastOccurenceInString();
        occurencesInAString();
        firstandlastOccurence();
        findCharInaString();
        findChar();
        revOfString1();
        concatString();
        stringTokenizer();
        stringSplit();
        swapStrings();
        compareStrings();
    }

    //to reverse given String
    public static  void revOfString() {
        String s = "JAVA";
        char[] ch = s.toCharArray();
        String rev = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        System.out.println(rev);
    }
    public static void palindromeOfString() {
        //to check whether given String is Palindrome
        String s1 = "LOL";
        char[] ch1 = s1.toCharArray();
        String temp = "";
        for (int i = ch1.length - 1; i >= 0; i--) {
            temp = temp + ch1[i];
        }
        System.out.println(temp);
        System.out.println(s1.length());
        System.out.println(temp.length());
        if (s1.equals(temp)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not a Palindrome");
        }
    }

    public static void replaceString() {
        //replacing a character in a string
        String s2 = "techie";
        System.out.println(s2.replace('e', 'E'));
    }

    public static void toUpperCase() {
        //convert String to UPPERCASE WITHOUT USING PRE DEFINED METHOD
        String str = "java";
        char strchar[] = str.toCharArray();
        String x = "abcdefghijklmnopqrstuvwxyz";
        char x1char[] = x.toCharArray();
        String y = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char y1char[] = y.toCharArray();
        int j;
        int flag = 0;
        for (int i = 0; i < strchar.length; i++) {
            flag = 0;
            for (j = 0; j < x1char.length; j++) {
                if (strchar[i] == x1char[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                strchar[i] = y1char[j];
            }
        }
        System.out.println(str);
        System.out.println(strchar);
    }

    public static void toLowerCase() {
        //converting string to LOWERCASE without using predefined method
        String str1 = "TECHIE";
        char str1char[] = str1.toCharArray();
        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char s1char[] = s1.toCharArray();
        String s2 = "abcdefghijklmnopqrstuvwxyz";
        char s2char[] = s2.toCharArray();
        int flag = 0;
        int j;
        for (int i = 0; i < str1char.length; i++) {
            flag = 0;
            for (j = 0; j < s1char.length; j++) {
                if (str1char[i] == s1char[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                str1char[i] = s2char[j];
            }
        }
        System.out.println(str1);
        System.out.println(str1char);
    }


    public static void sortOfString(){
        //sort String without using predefined method
        String str3="BDCA";
        char temp;
        char str3char[]=str3.toCharArray();
       /* for(int i=0;i<str3char.length;i++){
           if(str3char[i]<str3char[i+1]){
               temp=str3char[i];
           }

        }*/
    }

    public static void frstOccurenceInString(){
        //to find first occurances of given character in string without using predefined method
        String s4 = "JAVA";
        char s4char[] = s4.toCharArray();
        char ch4 = 'A';
        for (int i = 0; i < s4char.length; i++) {
            if (s4char[i] == ch4) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void  lastOccurenceInString() {
        //to find last occurances of given character in string without using predefined method
        String s4 = "JAVA";
        char s4char[] = s4.toCharArray();
        char ch4 = 'A';
        int temp = 0;
        for (int i = 0; i < s4char.length; i++) {
            if (s4char[i] == ch4) {
                temp = temp + i;
            }
        }
        System.out.println(temp);
    }
    public static void occurencesInAString() {
        //to find number 0f  occurances of given character in string without using predefined method
        String s4 = "JAVA";
        char s4char[] = s4.toCharArray();
        char ch4 = 'A';
        for (int i = 0; i < s4char.length; i++) {
            if (s4char[i] == ch4) {
                System.out.println("given character occured at " + i + " position");
            }
        }
    }
    public static void firstandlastOccurence() {
        //to find first and last 0f  occurances of given character in string  using predefined method
        String s5 = "JAVA";
        char s5char[] = s5.toCharArray();
        char ch5 = 'A';
        int firstindex = s5.indexOf(ch5);
        System.out.println(" First Occurence of given character is at " + firstindex + " position ");
        int lastindex = s5.lastIndexOf(ch5);
        System.out.println(" last Occurence of given character is at " + lastindex + " position ");
    }
    public static void findCharInaString() {
        //find out character based on index without using pre-defined method
        String s6 = "JAVA";
        char s6char[] = s6.toCharArray();
        int index = 2;
        for (int i = 0; i < s6char.length; i++) {
            if (index == i) {
                System.out.println(s6char[i]);
                break;
            }
        }
    }

    public static void findChar() {
        //find out character based on index with using pre-defined method
        String s7 = "Techie";
        char[] s7char = s7.toCharArray();
        char s8 = s7.charAt(3);
        System.out.println(s8);
    }
    public static void revOfString1() {
        //String reverse using charAt()
        String s9 = "JAVA";
        String rev = "";
        char[] s9char = s9.toCharArray();
        for (int i = s9char.length - 1; i >= 0; i--) {
            rev = rev + s9.charAt(i);
        }
        System.out.println(rev);
    }

    public static void concatString() {
        //concatenating Strings
        String s10 = "JAVA";
        String s11 = "TECHIE";
        String s12 = s10 + s11;//can be done with'+' operator
        System.out.println(s12);
        System.out.println(s10.concat(s11));// can be done with concat() method
    }

    public static void stringTokenizer(){
        String s="Java is a programming language";
        StringTokenizer s1=new StringTokenizer(s);
        int len=0;
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken(" "));
            len++;
        }
        System.out.println(len);

    }
    public static void stringSplit(){
        String s="Java   is    a    programming     language";
        String [] s1=s.split(" ");
        for(String temp:s1) {
            System.out.println(temp);
        }
    }
    public  static void swapStrings() {
        String s1 = "JAVA";
        String s2 = "TECHIE";
        String temp = " ";
        System.out.println("value of String 1 and String 2 Before Swapping: " + s1 + " " + s2);
        temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("value of String 1 and String 2 After Swapping: " + s1 + " " + s2);
    }

    public static void compareStrings(){
        String s1="java";
        char[]s1char= s1.toCharArray();
        String s2="java";
        int flag=0;
        char[] s2char= s2.toCharArray();
        for(int i=0;i<s1char.length;i++){
            if(s1char[i]==s2char[i])
            {
                flag=1;
            }else{
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not Equal");
        }
    }

    }


