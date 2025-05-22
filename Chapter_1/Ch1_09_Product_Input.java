package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_09_Product_Input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = input.nextInt();

        System.out.print("Enter the value of b : ");
        int b = input.nextInt();

        System.out.println("The product is : "+ (a * b));
    }
}