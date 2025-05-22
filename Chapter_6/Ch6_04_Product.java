package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_04_Product
{
    public static int product(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Value for a : ");
        int a = input.nextInt();

        System.out.print("Enter a Value for b : ");
        int b = input.nextInt();

        System.out.println("The Product of a & b : "+ product(a, b));
    }
}