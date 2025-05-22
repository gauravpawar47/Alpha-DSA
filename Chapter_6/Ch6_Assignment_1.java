package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_Assignment_1
{
    public static int average(int num1, int num2, int num3)
    {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args)
    {
        // Q. Write a Java method to compute the average of three numbers

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for Num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the value for Num2 : ");
        int num2 = input.nextInt();

        System.out.print("Enter the value for Num3 : ");
        int num3 = input.nextInt();

        System.out.println("The Average is : "+ average(num1, num2, num3));
    }
}