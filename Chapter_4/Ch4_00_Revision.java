package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_00_Revision
{
    public static void main(String[] args)
    {
        // 2 - While Loop

//        int i = 1;
//
//        while(i <= 100)
//        {
//            System.out.print(i +" ");
//            i += 1;
//        }

        // 3 - Print 1-10

//        int i = 1;
//
//        while(i <= 10)
//        {
//            System.out.print(i +" ");
//            i += 1;
//        }

        // 4 - Print 1 to N

//        Scanner input = new Scanner(System.in);
//        int i = 1;
//
//        System.out.print("Enter the range : ");
//        int n = input.nextInt();
//
//        while (i <= n)
//        {
//            System.out.print(i +" ");
//            i += 1;
//        }

        // 5 - Sum of First N natural numbers

//        Scanner input = new Scanner(System.in);
//        int i = 1;
//        int sum = 0;
//
//        System.out.print("Enter the range : ");
//        int n = input.nextInt();
//
//        while(i <= n)
//        {
//            sum += i;
//            i++;
//        }
//
//        System.out.println("Sum is : "+ sum);

        // 6 - For Loop

//        for(int i = 1; i <= 10; i++)
//        {
//            System.out.print(i +" ");
//        }

        // 7 - Print Square Pattern

//        for(int i = 0; i < 4; i++)
//        {
//            System.out.println("****");
//        }

        // 8 - Print Reverse Of Number

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int num = input.nextInt();
//
//        System.out.print("Reversed Number : ");
//        while(num > 0)
//        {
//            int lastDigit = num % 10;
//            System.out.print(lastDigit);
//            num /= 10;
//        }

        // 9 - Reverse the Given Number

//        Scanner input = new Scanner(System.in);
//        int result = 0;
//
//        System.out.print("Enter a Number : ");
//        int num = input.nextInt();
//
//        while (num > 0)
//        {
//            int lastDigit = num % 10;
//            result = (result * 10) + lastDigit;
//            num /= 10;
//        }
//
//        System.out.print("Reversed Number : "+ result);

        // 10 - Do-While Loop

//        int i = 1;
//
//        do
//        {
//            System.out.print(i +" ");
//            i += 1;
//        }while (i <= 10);

        // 11 - Break Statement

//        for(int i = 1; i < 100; i++)
//        {
//            System.out.print(i +" ");
//
//            if(i == 25)
//                break;
//        }

        // 12 - Question (Break)

//        Scanner input = new Scanner(System.in);
//        int num;
//
//        do
//        {
//            System.out.print("\nEnter a number : ");
//            num = input.nextInt();
//
//            if(num % 10 == 0)
//                break;
//
//            System.out.println("Number is : "+ num);
//        }while (true);

        // 13 - Continue

//        for(int i = 1; i <= 5; i++)
//        {
//            if(i == 3)
//                continue;
//
//            System.out.print(i +" ");
//        }

        // 14 - Question (Continue)

//        Scanner input = new Scanner(System.in);
//        int num;
//
//        do
//        {
//            System.out.print("\nEnter a Number : ");
//            num = input.nextInt();
//
//            if(num % 10 == 0)
//                continue;
//
//            System.out.println("Number : "+ num);
//        }while (true);

        // 15 - Prime Number

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int num = input.nextInt();
//        boolean isPrime = true;
//
//        for(int i = 2; i < num / 2; i++)
//        {
//            if (num % i == 0)
//                isPrime = false;
//        }
//
//        if(isPrime)
//            System.out.print("Prime Number");
//        else
//            System.out.print("Composite Number");

        // Assignment Q1 - How many times "Hello" is Printed ?

//        for(int i=0; i<5; i++)
//        {
//            System.out.println("Hello");
//            i+=2;
//        }

        // --> 3

        // Assignment Q2 - Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

//        Scanner input = new Scanner(System.in);
//
//        int evenSum = 0;
//        int oddSum = 0;
//
//        while(true)
//        {
//            System.out.print("Enter a Number : ");
//            int num = input.nextInt();
//
//            if(num == 0)
//                break;
//
//            if(num % 2 == 0)
//                evenSum += num;
//            else
//                oddSum += num;
//        }
//
//        System.out.println("\nSum of Even Numbers : "+ evenSum);
//        System.out.println("Sum of Odd Numbers  : "+ oddSum);

        // Assignment Q3 - Write a Program to find the factorial of any number entered by the user

//        Scanner input = new Scanner(System.in);
//        int factorial = 1;
//
//        System.out.print("Enter a Number : ");
//        int num = input.nextInt();
//
//        for(int i = 1; i <= num; i++)
//        {
//            factorial *= i;
//        }
//
//        System.out.println("Factorial of "+ num +" is : "+ factorial);

        // Assignment Q4 - Write a program to print the multiplication table of a number N, entered by the user

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int n = input.nextInt();
//
//        for(int i = 1; i <= 10; i++)
//        {
//            System.out.println(n +" X "+ i +" : "+ (n * i));
//        }

        // Assignment Q5 - What is wrong in the following program ?

//        for (int i = 0; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
        // System.out.println("i after the loop = " + i );

        // Note - Originally the above statement is un commented but because it has error it can cause trouble
        // in execution of further programs that's why it's comment out

        // --> At Line 13, the i is not accessible because, As it's only accessible and usable within the loop
    }
}