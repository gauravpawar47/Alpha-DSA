package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_00_Revision
{
    public static void main(String[] args)
    {
        // 1 - If-Else

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your age : ");
//        int age = input.nextInt();
//
//        if(age >= 18)
//            System.out.println("You're Adult");
//        else
//            System.out.println("You're not Adult");

        // 2 - Largest of 2 Numbers

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value for n1 : ");
//        int n1 = input.nextInt();
//
//        System.out.print("Enter the value for n2 : ");
//        int n2 = input.nextInt();
//
//        if(n1 > n2)
//            System.out.println("n1 is largest number");
//        else
//            System.out.println("n2 is largest number");

        // 3 - Odd-Even

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value for num : ");
//        int num = input.nextInt();
//
//        if(num % 2 == 0)
//            System.out.println("Even Number");
//        else
//            System.out.println("Odd Number");

        // 4 - Else-If

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the value for age : ");
//        int age = input.nextInt();
//
//        if(age <= 3 && age >= 1)
//            System.out.println("You're Just a Baby !");
//        else if(age <= 7)
//            System.out.println("You're Just a Kid !");
//        else if(age < 18)
//            System.out.println("You're a Teenager !");
//        else if(age >= 18)
//            System.out.println("You're Adult !");
//        else
//            System.out.println("Invalid Age");

        // 5 - Income tax Calculator

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your Income : ");
//        int income = input.nextInt();
//
//        if(income < 500000)
//            System.out.println("Total Amount with Tax : "+ income);
//        else if(income >= 500000 && income <= 1000000)
//            System.out.println("Total Amount with Tax : "+ (income * 0.2));
//        else
//            System.out.println("Total Amount with Tax : "+ (income * 0.3));

        // 6 - Largest of 3 Numbers

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the Value of a : ");
//        int a = input.nextInt();
//
//        System.out.print("Enter the Value of b : ");
//        int b = input.nextInt();
//
//        System.out.print("Enter the Value of c : ");
//        int c = input.nextInt();
//
//        if(a > b)
//        {
//            if(a > c)
//                System.out.println("\nA is Largest");
//            else
//                System.out.println("\nC is Largest");
//        }
//        else
//        {
//            if (b > c)
//                System.out.println("\nB is Largest");
//            else
//                System.out.println("\nC is Largest");
//        }

        // 7 - Ternary Operator

//        int n1 = 20;
//        int n2 = 25;
//        String result = n1 > n2 ? "N1 is Largest"  : "N2 is Largest";
//
//        System.out.println("Value of n1 : "+ n1);
//        System.out.println("Value of n2 : "+ n2);
//        System.out.println("\n"+ result);

        // 8 - Check if Student is Pass or Fail

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the Marks : ");
//        int marks = input.nextInt();
//
//        String status = marks >= 35 ? "PASS" : "FAIL";
//        System.out.println(status);

        // 9 - Switch Statements

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your Choice : ");
//        int choice = input.nextInt();
//
//        switch (choice)
//        {
//            case 1 :
//                System.out.println("Mango Shake");
//                break;
//            case 2 :
//                System.out.println("Banana Shake");
//                break;
//            case 3 :
//                System.out.println("Pineapple Shake");
//                break;
//            default:
//                System.out.println("Invalid");
//        }

        // 10 - Calculators

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter value for a : ");
//        int a = input.nextInt();
//
//        System.out.print("Enter value for b : ");
//        int b = input.nextInt();
//
//        System.out.print("Enter Operation : ");
//        char ch = input.next().charAt(0);
//
//        switch (ch)
//        {
//            case '+':
//                System.out.println("\nAddition : "+ (a + b));
//                break;
//            case '-':
//                System.out.println("\nSubtraction : "+ (a - b));
//                break;
//            case '*':
//                System.out.println("\nMultiplication : "+ (a * b));
//                break;
//            case '/':
//                System.out.println("\nDivision : "+ (a / b));
//                break;
//            case '%':
//                System.out.println("\nModules : "+ (a % b));
//                break;
//            default:
//                System.out.println("\nInvalid");
//        }

        // Assignment Q1 - Write a Java Program to get a Number from User and print Whether it is Positive Or Negative

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int num = input.nextInt();
//
//        if(num >= 0)
//            System.out.println("\nPositive");
//        else
//            System.out.println("\nNegative");

        // Assignment Q2 - Finish the Following Code so that it Prints You have fever if your temperature is above 100 and Otherwise prints you don't have fever

        // Code
//        double temp = 103.5;

        // Solution
//        String report = temp > 100 ? "Fever is Encountered" : "Fever is not Encountered";
//        System.out.println("Status : "+ report);

        // Assignment Q3 - Write a Java Program to Input Week Number (1-7) and print day of week name using Switch Case

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Week Number (1-7) : ");
//        int ch = input.nextInt();
//
//        switch (ch)
//        {
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid");
//        }

        // Assignment Q4 - What wil be the Value of a & b in the following program

//        int a = 63, b = 36;
//        boolean x = (a < b ) ? true : false;
//        int y= (a > b ) ? a : b;

        // --> false, 63

        // Assignment Q5 - Write a Java Program that takes a year from the user and print whether that year is leap year or not

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Year : ");
//        int year = input.nextInt();
//
//        if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0)
//            System.out.println("Year is Leap Year");
//        else
//            System.out.println("Year is Not Leap Year");
    }
}