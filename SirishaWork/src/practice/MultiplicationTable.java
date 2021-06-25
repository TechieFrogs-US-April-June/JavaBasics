package SirishaWork.src.practice;

public class MultiplicationTable {
    public static void main(String[] args) {

         int a = 5;
         int mul = 0;
         for(int i = 1; i <= 10; i++)
         {
             mul = a * i;
             System.out.println(a + "*" + i +"=" + mul);
         }
    }
}
