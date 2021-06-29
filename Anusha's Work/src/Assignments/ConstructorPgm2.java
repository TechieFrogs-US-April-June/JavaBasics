package Assignments;

public class ConstructorPgm2 {
        private int var;
        public ConstructorPgm2()
        {
            this.var = 10;
        }
        public ConstructorPgm2(int num)
        {
            this.var = num;
        }
        public int getValue()
        {
            return var;
        }
        public static void main(String args[])
        {
            ConstructorPgm2 obj = new ConstructorPgm2();
            ConstructorPgm2 obj2 = new ConstructorPgm2(100);
            System.out.println("var is: "+obj.getValue());
            System.out.println("var is: "+obj2.getValue());
        }

}
