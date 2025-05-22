package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_01_Hollow_Rectangle
{
    public static void hollowRectangle(int rows, int cols)
    {
        System.out.println();
        // outer loop
        for(int i = 1; i <= rows; i++)
        {
            // inner loop
            for(int j = 1; j <= cols; j++)
            {
                // printing starsx
                if(i == 1 || i == rows || j == 1 || j == cols)
                    System.out.print("*");
                // printing spaces
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int rows = input.nextInt();

        System.out.print("Enter the Columns : ");
        int cols = input.nextInt();

        hollowRectangle(rows, cols);
    }
}