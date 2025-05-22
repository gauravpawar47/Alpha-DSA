package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_02_Sum
{
    public static int sum(int a, int b) // Parameters or Formal Parameters
    {
        return a + b;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for a : ");
        int a = input.nextInt();

        System.out.print("Enter a value for b : ");
        int b = input.nextInt();

        System.out.println("Sum is : "+ sum(a, b)); // Arguments or Actual Parameteres
    }
}