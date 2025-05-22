package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_09_Diamond_Pattern
{
    public static void diamondPattern(int num)
    {
        // 1st Half

        // outer loop (n times)
        for(int i = 1; i <= num; i++)
        {
            // inner loop

            // Spaces (n-i times)
            for(int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }

            // Stars ((2 * i) - 1)
            for(int k = 1; k <= (2 * i) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half

        // outer loop (n times)
        for(int i = num; i >= 1; i--)
        {
            // inner loop

            // Spaces (n-i times)
            for(int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }

            // Stars ((2 * i) - 1)
            for(int k = 1; k <= (2 * i) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Stars to Print : ");
        int num = input.nextInt();

        diamondPattern(num);
    }
}