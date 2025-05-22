package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_08_Sum_Input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = input.nextInt();

        System.out.print("Enter the value of b : ");
        int b = input.nextInt();

        System.out.println("The sum is : "+ (a + b));
    }
}