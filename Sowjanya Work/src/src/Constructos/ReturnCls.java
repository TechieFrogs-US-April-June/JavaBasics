package Constructos;

public class ReturnCls {
    public static int getSquare(int x) {
        return x * x;
    }
    ReturnCls() {
        this(7,56);
        System.out.println("dfmhgbjksyh");
    }
    ReturnCls(int x, int y) {
        System.out.println("dcngsffsdbgfjhdmshk");
    }


     int getSum(int x) {
        return x + x;
        // System.out.println("values");
    }
    int getSub(int x) {
        return x - x;
    }
    int getDiv(int x) {
        return x / x;
    }
    int getRem(int x) {
        return x % x;
    }


    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            int result = getSquare(i);
            System.out.println("square of " + i + " is :" + result);
        }
        ReturnCls r1 = new ReturnCls();
        int test = r1.getSum(5);
        System.out.println("sum= " +test);
        ReturnCls r2 = new ReturnCls(30,40);


    }
}
