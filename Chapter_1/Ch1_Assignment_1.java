package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_Assignment_1
{
    public static void main(String []args)
    {
        // Q. In a Program, Input 3 numbers : A, B and C. You have to output the average of these 3 numbers

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for A : ");
        int a = input.nextInt();

        System.out.print("Enter value for B : ");
        int b = input.nextInt();

        System.out.print("Enter value for C : ");
        int c = input.nextInt();

        System.out.println("\nThe Average is : "+ (a + b + c)/3);
    }
}