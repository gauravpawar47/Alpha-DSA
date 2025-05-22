package Programs.Chapter_2;
import java.util.Scanner;

public class Ch2_00_Revision
{
    public static void main(String[] args)
    {
        // 2 - Arithmetic Operators

//        Scanner input = new Scanner(System.in);
//
//        int a;
//        int b;
//
//        System.out.print("Enter the Value of a : ");
//        a = input.nextInt();
//
//        System.out.print("Enter the Value of b : ");
//        b = input.nextInt();
//
//        System.out.println("\nAddition of a and b : "+ (a + b));
//        System.out.println("Subtraction of a and b : "+ (a - b));
//        System.out.println("Multiplication of a and b : "+ (a * b));
//        System.out.println("Division of a and b : "+ (a / b));
//        System.out.println("Modules of a and b : "+ (a % b));

        // 3 - Unary Operators

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value of a : ");
//        int a = input.nextInt();
//
//        ++a; // increment and then make use
//        System.out.println("\nPre Incremented a : "+ a);
//
//        a++; // make use and then increment
//        System.out.println("Post Incremented a : "+ a);
//
//        --a; // decrement and then make use
//        System.out.println("Pre Decremented a : "+ a);
//
//        a--; // make use and then decrement
//        System.out.println("Post Decremented a : "+ a);

        // 4 - Relational Operators

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value for a : ");
//        int a = input.nextInt();
//
//        System.out.print("Enter the value for b : ");
//        int b = input.nextInt();
//
//        System.out.println("\nEquality : "+ (a == b));
//        System.out.println("Inequality : "+ (a != b));
//        System.out.println("Greater than : "+ (a > b));
//        System.out.println("Less than : "+ (a < b));
//        System.out.println("Greater than Equal : "+ (a >= b));
//        System.out.println("Less than Equal : "+ (a <= b));

        // 5 - Logical Operators

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value for a : ");
//        int a = input.nextInt();
//
//        System.out.print("Enter the value for b : ");
//        int b = input.nextInt();
//
//        System.out.print("Enter the value for c : ");
//        int c = input.nextInt();
//
//        System.out.print("Enter the value for d : ");
//        int d = input.nextInt();
//
//        System.out.println("\nAND : "+ ((a == b) && (c == d)));
//        System.out.println("OR : "+ ((a == b) || (c == d)));
//        System.out.println("NOT : "+ (!(a == b)));

        // 6 - Assignment Operator

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the Value of a : ");
//        int a = input.nextInt();
//
//        System.out.println("\nValue of a : "+ a);
//        System.out.println("Add 2 : "+ (a += 2));
//        System.out.println("Sub 2 : "+ (a -= 2));
//        System.out.println("Mul 2 : "+ (a *= 2));
//        System.out.println("Div 2 : "+ (a /= 2));
//        System.out.println("Mod 2 : "+ (a %= 2));

        // Assignment Q1 - What will be the output of the following program

//        int x = 2;
//        int y = 5;
//
//        int exp1 = (x * y / 2);
//        int exp2 = (x * (y / x));
//
//        System.out.print(exp1 +" , ");
//        System.out.print(exp2);

        // --> 5 , 4

        // Assignment Q2 - What will be the output of the following program

//        int x = 200, y = 50, z = 100;
//
//        if(x > y && y > z)
//        {
//            System.out.println("Hello");
//        }
//
//        if(z > y && z < x)
//        {
//            System.out.println("Java");
//        }
//
//        if((y + 200) < x && (y + 150) < z)
//        {
//            System.out.println("Hello Java");
//        }

        // --> Java

        // Assignment Q3 - What will be the output of the following program

//        int x, y, z;
//        x  = y = z = 2;
//        x += y;
//        System.out.println(x);
//        y -= z;
//        System.out.println(y);
//        z /= (x + y);
//        System.out.println(z);
//
//        System.out.println("\n"+ x +" "+ y +" "+ z);

        // --> 4 0 0

        // Assignment Q4 - What will be the output of the following program

//        int x = 9, y = 12;
//        int a = 2, b = 4, c = 6;
//
//        int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / ( a + b * y);
//
//        System.out.println(exp);

        // --> 278

        // Assignment Q5 - What will be the output of the following program

//        int x = 10, y = 5;
//
//        int exp1 = (y * (x / y + x / y));
//        int exp2 = (y * x / y + y * x / y);
//
//        System.out.println(exp1);
//        System.out.println(exp2);

        /* --> 20
               20
        */
    }
}