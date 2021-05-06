package ClassesAndObjectsAssignment;

public class Complex {
    private int img;
    private int real;

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    static Complex sum(Complex c1, Complex c2) {
        int real_sum = c1.real + c2.real;
        int real_img = c1.img + c2.img;

        Complex c = new Complex(real_sum, real_img);
        return c;
    }

    static Complex diff(Complex c1, Complex c2) {
        int real_sum = c1.real - c2.real;
        int real_img = c1.img - c2.img;

        Complex c = new Complex(real_sum, real_img);
        return c;
    }

    static Complex multiply(Complex c1, Complex c2) {
        int real_sum = c1.real * c2.real;
        int real_img = c1.img * c2.img;

        Complex c = new Complex(real_sum, real_img);
        return c;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(9,12);
        Complex c2 = new Complex(5,7);
        Complex c_sum = sum(c1, c2);
        System.out.println("Complex number sum: "+c_sum.real + "+"+c_sum.img+"i");
        Complex c_diff = diff(c1, c2);
        System.out.println("Complex number sum: "+c_diff.real + "+"+c_diff.img+"i");
        Complex c_mult = multiply(c1, c2);
        System.out.println("Complex number sum: "+c_mult.real + "+"+c_mult.img+"i");
    }
}
