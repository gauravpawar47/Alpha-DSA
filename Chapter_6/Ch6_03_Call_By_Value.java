package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_03_Call_By_Value
{
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Value for a : ");
        int a = input.nextInt();

        System.out.print("Enter a Value for b : ");
        int b = input.nextInt();

        swap(a, b);

        System.out.println("\nThe Value of a : "+ a);
        System.out.println("The Value of b : "+ b);
    }
}