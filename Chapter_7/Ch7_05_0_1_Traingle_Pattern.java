package Programs.Chapter_7;
import java.util.Scanner;

public class Ch7_05_0_1_Traingle_Pattern
{
    public static void zeroOneTrainglePattern(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                if((i+j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Range : ");
        int num = input.nextInt();

        zeroOneTrainglePattern(num);
    }
}