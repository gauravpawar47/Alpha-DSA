package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_03_Even_Odd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to check whether it's Even or Odd : ");
        int num = input.nextInt();

        if(num % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
}