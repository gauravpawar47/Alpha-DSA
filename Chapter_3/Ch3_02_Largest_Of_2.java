package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_02_Largest_Of_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for A : ");
        int a = input.nextInt();

        System.out.print("Enter the value for B : ");
        int b = input.nextInt();

        if(a > b)
            System.out.println("\nA is greatest of 2 numbers");
        if(a == b)
            System.out.println("\nBoth are Equal");
        else
            System.out.println("\nB is greatest of 2 numbers");
    }
}