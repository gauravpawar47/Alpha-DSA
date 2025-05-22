package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_11_Prime_In_Ranges
{
    public static boolean isPrime(int num)
    {
        if(num == 2)
            return true;

        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimes(int range)
    {
        for(int i = 2; i <= range; i++)
        {
            if(isPrime(i))
                System.out.print(i +" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Range to print Prime Numbers : ");
        int range = input.nextInt();

        System.out.print("The Prime Numbers in "+ range +" range are : ");
        printPrimes(range);
    }
}