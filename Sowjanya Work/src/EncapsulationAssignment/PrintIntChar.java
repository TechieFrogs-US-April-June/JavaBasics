package EncapsulationAssignment;

public class PrintIntChar {

    void print(int n, char c) {
        System.out.println("int value : " +n + " char value: " +c);
    }

    void print(char c, int n) {
        System.out.println("char value : " +c + " int value: " +n);
    }

    public static void main(String[] args) {
        PrintIntChar icObj = new PrintIntChar();

        icObj.print(4596, 'h');
        icObj.print('y', 909);
    }
}
