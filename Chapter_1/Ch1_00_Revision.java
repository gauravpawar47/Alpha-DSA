package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_00_Revision
{
    public static void main(String[] args)
    {
        // 3 - Output

//        System.out.println("Hello World");
//        System.out.printf("Hello World\n");
//        System.out.print("Hello World\n");

        // 4 - Pattern

//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");

        // 5 - Variables

//        int a = 15;
//        int b = 20;
//
//        System.out.println("The Value of a : "+ a);
//        System.out.println("The Value of b : "+ b);
//
//        System.out.println("Sum is : "+ (a + b));

        // 6 - Data Types

//        byte a = 127; // -128 to 127
//        short b = 29999; // -30000 to 29999
//        int c = 2099999999; // -1999999999 to 2099999999
//        long d = -1999999999; // -1999999999 to 2099999999
//
//        float e = -299999999999999999999999999999999999999.9f; // -299999999999999999999999999999999999999.9fto 299999999999999999999999999999999999999.9
//        double f = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.9; // -99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.9 to 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.9
//
//        char g = 'g'; // 'A' to 'Z' , 'a' to 'z' , and other special symbols
//        boolean h = true; // true or false
//
//        System.out.println("Value of Byte : "+ a);
//        System.out.println("Value of Short : "+ b);
//        System.out.println("Value of Int : "+ c);
//        System.out.println("Value of Long : "+ d);
//        System.out.println("Value of Float : "+ e);
//        System.out.println("Value of Double : "+ f);
//        System.out.println("Value of Char : "+ g);
//        System.out.println("Value of Boolean : "+ h);

        // 7. Sum of a & b

//        int a = 4;
//        int b = 10;
//
//        System.out.println("Value of a : "+ a);
//        System.out.println("Value of b : "+ b);
//
//        System.out.println("Sum is : "+ (a + b));

        // 8. Comments

//        Comments are the lines of code that doesn't get execute

        /*
        The above method is used to single line
        and this method is used for multi-line
         */

        // 9. Inputs

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Byte : ");
//        byte var1 = input.nextByte();
//
//        System.out.print("Short : ");
//        short var2 = input.nextShort();
//
//        System.out.print("Int : ");
//        int var3 = input.nextInt();
//
//        System.out.print("Long : ");
//        long var4 = input.nextLong();
//
//        System.out.print("Float : ");
//        float var5 = input.nextFloat();
//
//        System.out.print("Double : ");
//        double var6 = input.nextDouble();
//
//        System.out.print("Char : ");
//        char var7 = input.next().charAt(0);
//
//        System.out.print("Boolean : ");
//        boolean var8 = input.nextBoolean();
//
//        System.out.println("\nValue of Byte : "+ var1);
//        System.out.println("Value of Short : "+ var2);
//        System.out.println("Value of Int : "+ var3);
//        System.out.println("Value of Long : "+ var4);
//        System.out.println("Value of Float : "+ var5);
//        System.out.println("Value of Double : "+ var6);
//        System.out.println("Value of Char : "+ var7);
//        System.out.println("Value of Boolean : "+ var8);

        // 10. Sum (input)

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value of n1 : ");
//        int n1 = input.nextInt();
//
//        System.out.print("Enter the value of n2 : ");
//        int n2 = input.nextInt();
//
//        System.out.println("Sum is : "+ (n1 + n2));

        // 11. Product (input)

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value of n1 : ");
//        float n1 = input.nextFloat();
//
//        System.out.print("Enter the value of n2 : ");
//        float n2 = input.nextFloat();
//
//        System.out.println("Product is : "+ (n1 * n2));

        // 12. Area Of Circle

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the Radius : ");
//        float radius = input.nextFloat();
//
//        System.out.println("Area of Circle : "+ (2.14f * radius * radius));

        // 13. Type Conversion

//        byte a = 2;
//        short b = a;
//        int c = b;
//        long d = c;
//        float e = d;
//        double f = e;
//
//        System.out.println("Implicit Or Widening");
//        System.out.println("a : "+ a);
//        System.out.println("b : "+ b);
//        System.out.println("c : "+ c);
//        System.out.println("d : "+ d);
//        System.out.println("e : "+ e);
//        System.out.println("f : "+ f);

        // 14. Type Casting

//        double a = 2222.33;
//        float b = (float) a;
//        long c = (long) b;
//        int d = (int) c;
//        short e = (short) d;
//        byte f = (byte) e;
//
//        System.out.println("Explicit");
//        System.out.println("a : "+ a);
//        System.out.println("b : "+ b);
//        System.out.println("c : "+ c);
//        System.out.println("d : "+ d);
//        System.out.println("e : "+ e);
//        System.out.println("f : "+ f);

        // 15. Type Promotion

        // Type 1 - Byte, Short, Char, Int (auto - int)

//        byte a = 13;
//        short b = 14;
//        char c = 'c';
//        int d = a + b + c;
//
//        System.out.println("Sum : "+ d);

        // Type 2 - Long, Double, Float (manual - respective datatype)

//        long e = 124;
//        float f = 24.3f;
//        double g = 2323.23;
//        double h = e + f + g;
//
//        System.out.println("Sum : "+ h);

        // Assignment Q1 - In a program, input 3 numbers: A,B,C. You've to output the average of 3 Numbers

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value of A : ");
//        int a = input.nextInt();
//
//        System.out.print("Enter the value of B : ");
//        int b = input.nextInt();
//
//        System.out.print("Enter the value of C : ");
//        int c = input.nextInt();
//
//        System.out.println("Average : "+ (a + b + c) / 3);

        // Assignment Q2 - In a program, input the side of square. You've to output the area of square

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the side of Square : ");
//        float side = input.nextFloat();
//
//        System.out.println("Area of Square : "+ (side * side));

        // Assignment Q3 - Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the Cost of Pencil : ");
//        float pencil = input.nextFloat();
//
//        System.out.print("Enter the Cost of Pen : ");
//        float pen = input.nextFloat();
//
//        System.out.print("Enter the Cost of Eraser : ");
//        float eraser = input.nextFloat();
//
//        System.out.println("Total Amount : "+ (pencil + pen + eraser + (pencil + pen + eraser) * 18/100));

        // Assignment Q4 - What will be the type of the result in the following Java code

//        byte b = 4;
//        char c = 'a';
//        short s = 512;
//        int i = 1000;
//        float f = 3.14f;
//        double d = 99.9954;

        // result = (f * b) + (i % c) - (d * s);

        // --> double

        // Assignment Q5 - Will the following statement give any error in Java ?

//         int $ = 24;

        // --> Yes, the above statement will throw an error, that variable name should not start with symbol
    }
}