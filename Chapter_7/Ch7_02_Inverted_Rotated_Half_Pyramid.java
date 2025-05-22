package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_02_Inverted_Rotated_Half_Pyramid
{
    public static void invertedRotatedHalfPyramid(int num)
    {
        // outer loop
        for(int i = 1; i <= num; i++)
        {
            // inner loop 1- print space
            for(int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }

            // inner loop 2- print stars
            for(int j = 1; j <= i; j++)
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

        invertedRotatedHalfPyramid(num);
    }
}