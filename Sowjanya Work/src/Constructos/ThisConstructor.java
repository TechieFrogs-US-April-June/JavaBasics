package Constructos;

public class ThisConstructor {
    ThisConstructor() {
        this(6);

        System.out.println("Inside constructor ThisConstructor()");

    }
    ThisConstructor(int i) {
        this(i,i+1);
        System.out.println("Inside constructor ThisConstructor(i)");
    }
    ThisConstructor(int x,int j) {
        System.out.println("Inside constructor ThisConstructor(int x,int y)");
    }

    public static void main(String[] args) {
        ThisConstructor tc = new ThisConstructor();
        ThisConstructor tc1 = new ThisConstructor(10,30);
        ThisConstructor tc2 = new ThisConstructor(60);
        System.out.println("End of main()");
    }
}
