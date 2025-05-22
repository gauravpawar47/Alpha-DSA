package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_09_Prime
{
    public static boolean isPrime(int num)
    {
        if(num == 2)
            return true;

        for (int i = 2; i < Math.sqrt(num); i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(isPrime(num))
            System.out.println("The Entered Number is Prime Number");
        else
            System.out.println("The Entered Number is Composite Number");
    }
}