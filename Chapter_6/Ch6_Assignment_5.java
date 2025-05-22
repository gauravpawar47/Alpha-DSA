package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_Assignment_5
{
    public static int sum(int num)
    {
        int result = 0;

        while(num > 0)
        {
            int lastDigit = num % 10;
            result += lastDigit;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args)
    {
        // Q. Write a Java method to compute the sum of the digits in an integer.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        System.out.println("The Sum of Digits is : "+ sum(num));
    }
}