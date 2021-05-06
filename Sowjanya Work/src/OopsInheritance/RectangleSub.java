package OopsInheritance;

public class RectangleSub extends ShapeSuper {
    private int width;
    private int height;

    //1st constructor
   public RectangleSub(int width, int height) {
        this(0, 0, 0, 0); //calls 2nd constructor
        System.out.println(width+ " " +height);
    }

    //2nd constructor
    public RectangleSub(int x, int y, int width, int height) {
        super(x, y); //calls constructor from parent(Shapesuper)
        this.width = width;
        this.height = height;
        System.out.println(x+ " " +y+ " " +width+ " " +height);
    }

    public static void main(String[] args) {
        RectangleSub Obj = new RectangleSub(35,95);
        RectangleSub Obj1 = new RectangleSub(1 , 2, 20,50);


    }

}
