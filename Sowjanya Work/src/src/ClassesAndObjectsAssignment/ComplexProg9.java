package ClassesAndObjectsAssignment;

public class ComplexProg9 {
    private int img;
    private int real;

    ComplexProg9(int real, int img) {
        this.real = real;
        this.img = img;
    }

    static ComplexProg9 sum(ComplexProg9 c1, ComplexProg9 c2) {
        int real_sum = c1.real + c2.real;
        int real_img = c1.img + c2.img;

        ComplexProg9 c = new ComplexProg9(real_sum, real_img);
        return c;
    }

    static ComplexProg9 diff(ComplexProg9 c1, ComplexProg9 c2) {
        int real_sum = c1.real - c2.real;
        int real_img = c1.img - c2.img;

        ComplexProg9 c = new ComplexProg9(real_sum, real_img);
        return c;
    }

    static ComplexProg9 multiply(ComplexProg9 c1, ComplexProg9 c2) {
        int real_sum = c1.real * c2.real;
        int real_img = c1.img * c2.img;

        ComplexProg9 c = new ComplexProg9(real_sum, real_img);
        return c;
    }

    public static void main(String[] args) {
        ComplexProg9 c1 = new ComplexProg9(9,12);
        ComplexProg9 c2 = new ComplexProg9(5,7);
        ComplexProg9 c_sum = sum(c1, c2);
        System.out.println("Complex number sum: "+c_sum.real + "+"+c_sum.img+"i");
        ComplexProg9 c_diff = diff(c1, c2);
        System.out.println("Complex number sum: "+c_diff.real + "+"+c_diff.img+"i");
        ComplexProg9 c_mult = multiply(c1, c2);
        System.out.println("Complex number sum: "+c_mult.real + "+"+c_mult.img+"i");
    }
}
