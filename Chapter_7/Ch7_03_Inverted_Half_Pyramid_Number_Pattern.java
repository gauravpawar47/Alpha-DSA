package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_03_Inverted_Half_Pyramid_Number_Pattern
{
    public static void invertedHalfPyramidNumberPattern(int num)
    {
        System.out.println();
        // outer loop
        for(int i = 1; i <= num; i++)
        {
            // inner loop
            for(int j = 1; j <= num - i + 1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Numbers to print : ");
        int num = input.nextInt();

        invertedHalfPyramidNumberPattern(num);
    }
}