package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_12_Binary_Decimal
{
    public static int decimalConversion(int binary)
    {
        int power = 0;
        int decimal = 0;

        while(binary > 0)
        {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, power));
            binary /= 10;
            power += 1;
        }
        return decimal;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Binary Number to Convert : ");
        int binary = input.nextInt();

        System.out.println("The Decimal Number of "+ binary +" is : "+ decimalConversion(binary));
    }
}