package Programs.Chapter_5;
import java.util.Scanner;

public class Ch5_01_Star_Pattern
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter upto how many stars you want to print : ");
        int range = input.nextInt();

        for(int i = 1; i <= range; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}