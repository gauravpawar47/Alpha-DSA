import java.util.Scanner;

public class _1_Java_Basics
{
    public static void _3_Output()
    {
        System.out.println("Hello World");
    }

    public static void _4_Pattern()
    {
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    public static void _7_Sum(int a, int b)
    {
        System.out.println("Sum : "+ (a + b));
    }

    public static void _9_Input()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = input.nextLine();

        System.out.println("Your Name : "+ name);
    }

    public static void _11_Product(int a, int b)
    {
        System.out.println("Multiplication : "+ (a * b));
    }

    public static void _12_AreaCircle(int r)
    {
        System.out.println("Area : "+ (3.14 * r * r));
    }

    public static void _13_TypeConversion()
    {
        byte b = 123;
        short s = b;
        int i = s;
        long l = i;
        float f = i;
        double d = f;

        System.out.println("Value of Double : "+ d);
    }

    public static void _14_TypeCasting()
    {
        double d = 4343.343;
        float f = (float) d;
        long l = (long) d;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("Value of Byte : "+ b);
    }

    public static void main(String[] args)
    {
        _3_Output();
        System.out.println();

        _4_Pattern();
        System.out.println();
        
        _7_Sum(5, 8);
        System.out.println();
        
        _9_Input();
        System.out.println();
        
        _11_Product(5, 8);
        System.out.println();
        
        _12_AreaCircle(4);       
        System.out.println();

        _13_TypeConversion();       
        System.out.println();

        _14_TypeCasting();     
        System.out.println();
    }
}