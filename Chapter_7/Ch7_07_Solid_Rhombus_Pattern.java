package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_07_Solid_Rhombus_Pattern
{
    public static void solidRhombus(int num)
    {
        // outer loop (n times)
        for(int i = 1; i <= num; i++)
        {
            // spaces (n - i times)
            for(int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }

            // stars (n times)
            for(int k = 1; k <= num; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of Stars to Print : ");
        int num = input.nextInt();

        solidRhombus(num);
    }
}