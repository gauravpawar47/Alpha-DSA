package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_Assignment_3
{
    public static void main(String[] args)
    {
        // Q. Write a Program to Find the Factorial of any number entered by the user

        Scanner input = new Scanner(System.in);
        int factorial = 1;

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        System.out.println("The Factorial of num "+ num +" is : "+ factorial);
    }
}