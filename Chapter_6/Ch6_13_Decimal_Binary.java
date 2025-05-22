package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_13_Decimal_Binary
{
    public static int binaryConversion(int decimal)
    {
        int power = 0;
        int binary = 0;

        while(decimal > 0)
        {
            int lastDigit = decimal % 2;
            binary = binary + (lastDigit * (int) Math.pow(10, power));
            decimal /= 2;
            power += 1;
        }
        return binary;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Decimal Number to Convert : ");
        int decimal = input.nextInt();

        System.out.println("The Binary Number of "+ decimal +" is : "+ binaryConversion(decimal));
    }
}