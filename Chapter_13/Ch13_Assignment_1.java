package Programs.Chapter_13;

class Complex
{
    int real;
    int imag;

    public Complex(int real, int imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public static Complex sum(Complex a, Complex b)
    {
        return new Complex((a.real + b.real) , (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b)
    {
        return new Complex((a.real - b.real) , (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b)
    {
        return new Complex((a.real + b.real) * (a.imag + b.imag) , (a.real - b.real) * (a.imag - b.imag));
    }

    public void print()
    {
        if(real == 0 && imag != 0)
            System.out.println(imag +"i");
        else if(imag == 0 && real != 0)
            System.out.println(real);
        else
            System.out.println(real +"+"+ imag +"i");
    }
}

public class Ch13_Assignment_1
{
    public static void main(String[]args)
    {
        // Q. Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with
        // separate methods of each operation whose real and imaginary parts are entered by the user
        Complex obj = new Complex(5, 6);
        obj.print();
    }
}