package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_Assignment_3
{
    public static void main(String[] args)
    {
        // Q. Write a Java Program to Input Week Number (1-7) and print day of week name using Switch Case

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number from 1-7 : ");
        int day = input.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Input !");
                break;
        }
    }
}