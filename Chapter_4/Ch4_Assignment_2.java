package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_Assignment_2
{
    public static void main(String[] args)
    {
        // Q. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        Scanner input = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;

        while(true)
        {
            System.out.print("Enter a Number : ");
            int num = input.nextInt();

            if(num == 0)
                break;

            if(num % 2 == 0)
                sumEven += num;
            else
                sumOdd += num;
        }
        System.out.println("The Sum of All Even Numbers : "+ sumEven);
        System.out.println("The Sum of All Odd Numbers : "+ sumOdd);
    }
}