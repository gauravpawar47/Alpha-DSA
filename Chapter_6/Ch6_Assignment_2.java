package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_Assignment_2
{
    public static boolean isEven(int num)
    {
        return num % 2 == 0;
    }

    public static void main(String[] args)
    {
        // Q. Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        if(isEven(num))
            System.out.println("The Entered Number is Even");
        else
            System.out.println("The Entered Number is Odd");
    }
}