package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_00_Revision
{
    public static void _2_Function()
    {
        System.out.println("Hello World");
    }

    public static int _3_Sum(int a, int b)
    {
        return a + b;
    }

    public static void _6_Swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int _7_Product(int a, int b)
    {
        return  a * b;
    }

    public static int _8_Factorial(int n)
    {
        int factorial = 1;

        for(int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static int _9_binomialCoefficient(int n, int r)
    {
        int factN = _8_Factorial(n);
        int factR = _8_Factorial(r);
        int factNR = _8_Factorial(n-r);

        return factN / (factR * factNR);

    }

    public static int _11_Sum(int a, int b)
    {
        return  a + b;
    }

    public static int _11_Sum(int a, int b, int c)
    {
        return  a + b + c;
    }

    public static int _12_Sum(int a, int b)
    {
        return a + b;
    }

    public static float _12_Sum(float a, float b)
    {
        return a + b;
    }

    public static boolean _13_isPrime(int num)
    {
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
                return false;
        }
        return  true;
    }

    public static void _14_PrintPrimes(int range)
    {
        for(int i = 2; i <= range; i++)
        {
            if(_13_isPrime(i))
                System.out.print(i +" ");
        }
    }

    public static int _15_BinaryToDecimal(int num)
    {
        int power = 0;
        int result = 0;

        while(num > 0)
        {
            int lastDigit = num % 10;
            lastDigit = (int) (lastDigit * Math.pow(2, power));
            num /= 10;
            result += lastDigit;
            power++;
        }

        return result;
    }

    public static int _16_DecimalToBinary(int num)
    {
        int power = 0;
        int result = 0;

        while(num > 0)
        {
            int remainder = num % 2;
            result = result + (remainder * (int) Math.pow(10, power));
            num /= 2;
            power++;
        }

        return result;
    }

    public static void _17_PrintA()
    {
//        System.out.println(a);
        // The above statement will throw an error because we are trying to access the element which is declared in
        // method scope not in global scope
    }

    public static int Q1_Avg(int num1, int num2, int num3)
    {
        return (num1 + num2 + num3) / 3;
    }

    public static boolean Q2_isEven(int n)
    {
        return  n % 2 == 0;
    }

    public static boolean Q3_isPalindrome(int n)
    {
        int temp = n;
        int result = 0;

        while(temp > 0)
        {
            int lastDigit = temp % 10;
            result = (result * 10) + lastDigit;
            temp /= 10;
        }

        return n == result;
    }

    public static int Q5_Sum(int n)
    {
        int result = 0;

        while(n > 0)
        {
            int lastDigit = n % 10;
            result += lastDigit;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args)
    {
        // 2 - Function Syntax Demo

//        _2_Function();

        // 3 - Syntax with Parameters

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value of n1 : ");
//        int n1 = input.nextInt();
//
//        System.out.print("Enter the value of n2 : ");
//        int n2 = input.nextInt();
//
//        System.out.println("\nSum is : "+ _3_Sum(n1, n2));

        // 6 - Call By Value

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter value for n1 : ");
//        int n1 = input.nextInt();
//
//        System.out.print("Enter value for n2 : ");
//        int n2 = input.nextInt();
//
//        _6_Swap(n1, n2);
//        System.out.println("\nValue of n1 : "+ n1);
//        System.out.println("Value of n2 : "+ n2);

        // 7 - Product of a & b

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a value for n1 : ");
//        int n1 = input.nextInt();
//
//        System.out.print("Enter a value for n2 : ");
//        int n2 = input.nextInt();
//
//        System.out.println("\nProduct : "+ _7_Product(n1, n2));

        // 8 - Find Factorial

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int num = input.nextInt();
//
//        System.out.println("\nFactorial of "+ num +" is : "+ _8_Factorial(num));

        // 9 - Find Binomial Coefficient

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value for n: ");
//        int n = input.nextInt();
//
//        System.out.print("Enter the value for r : ");
//        int r = input.nextInt();
//
//        System.out.println("Binomial Coefficient is : "+ _9_binomialCoefficient(n, r));

        //  11 - Function Overloading using Parameters

//        System.out.println("Sum of 5 and 6 is : "+ _11_Sum(5, 6));
//        System.out.println("Sum of 5, 6 and 11 is : "+ _11_Sum(5, 6, 11));

        // 12 - Function Overloading using Data Types

//        System.out.println("Sum of 5 and 6 is : "+ _12_Sum(5, 6));
//        System.out.println("Sum of 5.1 and 5.9 is : "+ _12_Sum(5.1f, 5.9f));

        // 13 - Check if Number is Prime or Not (Optimized)

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int num = input.nextInt();
//
//        if(_13_isPrime(num))
//            System.out.print(num +" is Prime Number");
//        else
//            System.out.print(num +" is not Prime Number");

        // 14 - Primes in Range

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Range : ");
//        int range = input.nextInt();
//
//        System.out.print("Primes in "+ range +" Range is : ");
//        _14_PrintPrimes(range);

        // 15 - Binary to Decimal (Code)

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Binary Number : ");
//        int num = input.nextInt();
//
//        System.out.println("Decimal of "+ num +" is : "+ _15_BinaryToDecimal(num));

        // 16 - Decimal to Binary (Code)

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Decimal Number : ");
//        int num = input.nextInt();
//
//        System.out.println("Binary of "+ num +" is : "+ _16_DecimalToBinary(num));

        // 17 - Method Scope

//        int a = 5;
//        System.out.println("Value of a inside main function : "+ a);
//        _17_PrintA();

        // 18 - Block Scope

//        String str1 = "Outside Block";
//
//        {
//            String str2 = "Inside Block";
//
//            System.out.println("Execution Inside Block Begun");
//            System.out.println(str1);
//            System.out.println(str2);
//            System.out.println("Execution Inside Block Terminated");
//        }
//
//        System.out.println("\nExecution Outside Block Begun");
//        System.out.println(str1);
//        // System.out.println(str2); // Throws an error Because str2 is declared inside a block and cannot be
//        // accessed outside the block
//        System.out.println("Execution Outside Block Terminated");

        // Assignment Q1 - Write a Java Method to Compute the Average of Three Numbers

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Value for Num1 : ");
//        int num1 = input.nextInt();
//
//        System.out.print("Enter a Value for Num2 : ");
//        int num2 = input.nextInt();
//
//        System.out.print("Enter a Value for Num3 : ");
//        int num3 = input.nextInt();
//
//        System.out.println("Average is : "+ Q1_Avg(num1, num2, num3));

        // Assignment Q2 - Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int n = input.nextInt();
//
//        if(Q2_isEven(n))
//            System.out.println("Number is Even");
//        else
//            System.out.println("Number is Odd");

        // Assignment Q3 - Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int n = input.nextInt();
//
//        if(Q3_isPalindrome(n))
//            System.out.println(n +" is Palindrome Number");
//        else
//            System.out.println(n +" is Not Palindrome Number");

        // Assignment Q4 - Search about(Google) & use the following methods of the Math class in Java

        //        a. Math.min( )
        //        b. Math.max( )
        //        c. Math.sqrt( )
        //        d. Math.pow( )
        //        e. Math.avg( ) // This method doesn't exist
        //        f. Math.abs( )

//        System.out.println("The Minimum of 5, 4 is       : "+ Math.min(5, 4));
//        System.out.println("The Maximum of 5, 4 is       : "+ Math.max(5, 4));
//        System.out.println("The Square Root of 5 is      : "+ Math.sqrt(5));
//        System.out.println("The Square Root of 4 is      : "+ Math.sqrt(4));
//        System.out.println("The Power of 5, 4 is         : "+ Math.pow(5, 4));
//        System.out.println("The Absolute Value of 5.5 is : "+ Math.abs(5.5f));

        // Assignment Q5 - Write a Java method to compute the sum of the digits in an integer.

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int n = input.nextInt();
//
//        System.out.println("Sum of "+ n +" is : "+ Q5_Sum(n));
    }
}