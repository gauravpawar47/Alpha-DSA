package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_Assignment_5
{
    public static void main(String[] args)
    {
        // Q. Write a Java Program that takes a year from the user and print whether that year is leap year or not

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Year : ");
        int year = input.nextInt();

        if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0)
            System.out.println("Year is Leap year !");
        else
            System.out.println("Year is not Leap year !");

    }
}