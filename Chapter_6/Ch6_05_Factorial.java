package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_05_Factorial
{
    public static int factorial(int num)
    {
        int fact = 1;

        for(int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number to get Factorial : ");
        int num = input.nextInt();

        System.out.println("The Factorial of "+ num + " is : "+ factorial(num));
    }
}