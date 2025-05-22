package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_11_Palindromic_Number_Pattern
{
    public static void palindromicPattern(int num)
    {
        // outer loop (n times)
        for(int i = 1; i <= num; i++)
        {
            // inner loop

            // outer spaces (n-i times)
            for(int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }

            // descending order (i to 1 times)
            for(int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }

            // ascending order (2 to i times)
            for(int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Digits to Print : ");
        int num = input.nextInt();

        palindromicPattern(num);
    }
}