package EncapsulationAssignment;

public class PrintNumber {

    void printn(int x) {
        System.out.println("int value: " +x);
    }

    void printn(byte x1) {
        System.out.println("byte value: " +x1);
    }

    void printn(short x2) {
        System.out.println("short value: " +x2);
    }

    void printn(long y) {
        System.out.println("long value: " +y);
    }

    void printn(float z) {
        System.out.println("float value: " +z);
    }

    void printn(double a) {
        System.out.println("double value: " +a);
    }

    void printn(char c) {
        System.out.println("char value: " +c);
    }

    void printn(boolean b) {
        System.out.println("boolean value: " +b);
    }

    public static void main(String[] args) {
        PrintNumber pnObj = new PrintNumber();
        pnObj.printn(500);
        pnObj.printn((byte)(100));
        pnObj.printn((short)(7800));
        pnObj.printn((long)(456789));
        pnObj.printn(2478.90f);
        pnObj.printn(879065.50);
        pnObj.printn((char)(100));
        pnObj.printn(true);
    }
}
