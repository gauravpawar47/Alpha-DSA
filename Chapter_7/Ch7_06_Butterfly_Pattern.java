package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_06_Butterfly_Pattern
{
    public static void butterflyPattern(int num)
    {
        // 1st Half

        // Outer Loop (n times) - Ascending Order
        for(int i = 1; i <= num; i++)
        {
            // Stars (i times)
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            // Space (2*(n-1) times)
            for(int k = 1; k <= 2 * (num - i); k++)
            {
                System.out.print(" ");
            }

            // Stars (i times)
            for(int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half

        // Outer Loop (n times) - Descending Order
        for(int i = num; i >= 1; i--)
        {
            // Stars (i times)
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            // Space (2*(n-1) times)
            for(int k = 1; k <= 2 * (num - i); k++)
            {
                System.out.print(" ");
            }

            // Stars (i times)
            for(int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of Stars to Print : ");
        int num = input.nextInt();

        butterflyPattern(num);
    }
}