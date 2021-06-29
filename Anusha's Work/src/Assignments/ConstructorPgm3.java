package Assignments;

public class ConstructorPgm3 {
            private int var;
            public ConstructorPgm3(int num)
            {
                var=num;
            }

             public ConstructorPgm3() {
                   System.out.println("Default Construtor");
             }

             public int getValue() {
                return var;
             }
             public static void main(String args[]) {
                ConstructorPgm3 myobj = new ConstructorPgm3();
                System.out.println("value of var is: "+myobj.getValue());
             }
        }
