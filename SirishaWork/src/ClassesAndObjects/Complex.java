package ClassesAndObjects;

public class Complex {
    int real, imaginary;

    // Empty Constructor
    Complex()
    {
    }

    // Constructor to accept
    // real and imaginary part
    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }

    // Defining addComp() method
    // for adding two complex number
    Complex addComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();

        // adding real part of complex numbers
        temp.real = C1.real + C2.real;

        // adding Imaginary part of complex numbers
        temp.imaginary = C1.imaginary + C2.imaginary;

        // returning the sum
        return temp;
    }

    // Defining subtractComp() method
    // for subtracting two complex number
    Complex subtractComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();

        // subtracting real part of complex numbers
        temp.real = C1.real - C2.real;

        // subtracting Imaginary part of complex numbers
        temp.imaginary = C1.imaginary - C2.imaginary;

        // returning the difference
        return temp;
    }

    // Function for printing complex number
    void printComplexNumber()
    {
        System.out.println("Complex number: "
                + real + " + "
                + imaginary + "i");
    }
}