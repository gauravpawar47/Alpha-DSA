package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_08_Reverse_Given_Number
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int lastDigit;

        System.out.print("Enter the number to reverse : ");
        int num = input.nextInt();

        while(num > 0)
        {
            lastDigit = num % 10;
            result = (result * 10) + lastDigit;
            num /= 10;
        }
        System.out.println("Reversed Number is : "+ result);
    }
}