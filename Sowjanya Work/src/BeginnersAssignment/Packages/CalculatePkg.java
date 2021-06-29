package BeginnersAssignment.Packages;

public class CalculatePkg {

        public int add(int a, int b){
            return a+b;
        }

    public static void main(String[] args) {
        CalculatePkg obj = new CalculatePkg();

        System.out.println(obj.add(10,20));
    }
}
