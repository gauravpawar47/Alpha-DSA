package Programs.Chapter_2;
import java.util.Scanner;

public class Ch2_03_Relational_Operators
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a : ");
        int a = input.nextInt();

        System.out.print("Enter the value for b : ");
        int b = input.nextInt();

        System.out.println("\nEquality in a and b : "+ (a == b)); // equality in two operands
        System.out.println("Inequality in a and b : "+ (a != b)); // inequality in two operands
        System.out.println("Greater than in a and b : "+ (a > b)); // greater than in two operands
        System.out.println("Less than in a and b : "+ (a < b)); // less than in two operands
        System.out.println("Greater than equals to in a and b : "+ (a >= b)); // greater than equals to a and b
        System.out.println("Less than equals to in a and b : "+ (a <= b)); // less than equals to a and b
    }
}