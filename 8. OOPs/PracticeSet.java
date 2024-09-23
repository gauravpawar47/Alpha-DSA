class Complex
{
    private double real;
    private double imag;

    Complex()
    {
        real = 0;
        imag = 0;
    }

    Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public void addition(Complex c1, Complex c2)
    {
        System.out.println((c1.real + c2.real) +" + "+ (c1.imag + c2.imag) +"i");
    }
    
    public void subtraction(Complex c1, Complex c2)
    {
        System.out.println((c1.real - c2.real) +" + "+ (c1.imag - c2.imag) +"i");
    }

    public void print()
    {
        System.out.println(real +" + "+ imag +"i");
    }
}

public class PracticeSet
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(7, 8);
        c1.print();

        Complex c2 = new Complex(9, 4);
        c2.print();

        Complex c3 = new Complex();
        c3.addition(c1, c2);
        c3.subtraction(c1, c2);
    }
}