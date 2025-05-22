package Programs.Chapter_5;
import java.util.Scanner;

public class Ch5_04_Character_Pattern
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char ch = 'A';

        System.out.print("Enter upto how many characters you want to print : ");
        int range = input.nextInt();

        for(int i = 1; i <= range; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}