package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_Assignment_1
{
    public static void main(String[] args)
    {
        // Q. Write a Java Program to get a Number from User and print Whether it is Positive Or Negative

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        boolean status = (num >= 0) ? true : false;

        if(status)
            System.out.println("The Entered Number is Positive");
        else
            System.out.println("The Entered Number is Negative");
    }
}