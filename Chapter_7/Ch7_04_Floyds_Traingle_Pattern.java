package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_04_Floyds_Traingle_Pattern
{
    public static void floydsTrainglePattern(int num)
    {
        int counter = 1;
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(counter +" ");
                counter += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        floydsTrainglePattern(num);
    }
}