package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_14_Check_If_Number_Prime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isPrime = true;

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
                isPrime = false;
        }

        if(isPrime)
            System.out.println("The Entered Number is Prime");
        else
            System.out.println("The Entered Number is not Prime");
    }
}