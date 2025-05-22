package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_10_Number_Pyramid_Bonus
{
    public static void numberPyramid(int num)
    {
        // outer loop (n times)
        for(int i = 1; i <= num; i++)
        {
            // inner loop

            // Spaces (n-i times)
            for (int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }

            // Numbers (i times)
            for (int k = 1; k <= i; k++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Digits to Print : ");
        int num = input.nextInt();

        numberPyramid(num);
    }
}