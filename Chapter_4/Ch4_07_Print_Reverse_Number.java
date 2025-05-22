package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_07_Print_Reverse_Number
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int reverseNumber = 0;

        System.out.print("Enter a Number to be Reverse : ");
        int num = input.nextInt();

        while(num > 0)
        {
            reverseNumber = num % 10;
            System.out.print(reverseNumber);
            num /= 10;
        }
    }
}