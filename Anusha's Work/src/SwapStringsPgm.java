public class SwapStringsPgm {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="TECHIE";
        String temp=" ";
        System.out.println("value of String 1 and String 2 Before Swapping: "+ s1 +" "+ s2);
        temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("value of String 1 and String 2 After Swapping: "+ s1 +" "+ s2);
    }
}
