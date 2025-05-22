package Programs.Chapter_2;
import java.util.Scanner;

public class Ch2_04_Logical_Operators
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for Num1 : ");
        int a = input.nextInt();

        System.out.print("Enter the value for Num2 : ");
        int b = input.nextInt();

        System.out.print("Enter the value for Num3 : ");
        int c = input.nextInt();

        System.out.print("Enter the value for Num4 : ");
        int d = input.nextInt();

        System.out.println("\nThe Value of Num1 : "+ a);
        System.out.println("The Value of Num2 : "+ b);
        System.out.println("The Value of Num3 : "+ c);
        System.out.println("The Value of Num4 : "+ d);

        System.out.println("\nLogical && (AND) Operator : "+ (a < b && c > d));
        System.out.println("Logical || (OR) Operator : "+ (a > b || c < d));
        System.out.println("Logical ! (NOT) Operator : "+ !(a < b));
        System.out.println("Logical ! (NOT) Operator : "+ !(c == a));

        /*
        * && - Returns true if both exp return true
        * || - Returns false if both exp return false
        * ! - Return true if exp return false and return false if exp return true
        */
    }
}