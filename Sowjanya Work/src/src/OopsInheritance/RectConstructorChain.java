package OopsInheritance;

public class RectConstructorChain {
    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    RectConstructorChain() {
        this(0,0); //calls 2nd constructor
    }

    //2nd constructor
    RectConstructorChain(int width, int height) {
        this(0, 0, width, height); //calls 3rd constructor
        System.out.println(width+ " " +height);
    }

    //3rd constructor
    RectConstructorChain(int x, int y, int width, int height) {
        //initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println(x+ " " +y + " " +width+ " " +height);

    }


    public static void main(String[] args) {
        RectConstructorChain RecObj = new RectConstructorChain(10, 20);
        RectConstructorChain RecObj1 = new RectConstructorChain(1, 2 , 5,8);
        System.out.println(RecObj1.x + " " +RecObj1.y);
    }
}
