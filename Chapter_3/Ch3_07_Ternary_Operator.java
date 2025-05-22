package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_07_Ternary_Operator
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for Num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the value for Num2 : ");
        int num2 = input.nextInt();

        String result = (num1 > num2) ? "Num1 is Largest" : "Num2 is Largest";

        System.out.println(result);
    }
}