package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_08_Hollow_Rhombus_Pattern
{
    public static void hollowRhombus(int num)
    {
        // outer loop (n times)
        for(int i = 1; i <= num; i++)
        {
            // inner loop
            // Spaces (n - i times)
            for(int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }

            // stars + spaces (hollow)
            for(int k = 1; k <= num; k++)
            {
                if(i == 1 || i == num || k == 1 || k == num)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of Stars to Print : ");
        int num = input.nextInt();

        hollowRhombus(num);
    }
}