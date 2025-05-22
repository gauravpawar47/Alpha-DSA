package Programs.Chapter_2;
import java.util.Scanner;

public class Ch2_01_Arithmetic_Binary_Operators
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value for Num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the Value for Num2 : ");
        int num2 = input.nextInt();

        System.out.println();
        System.out.println("The Addition of Num1 and Num2 is : "+ (num1 + num2)); // + : used for Addition
        System.out.println("The Subtraction of Num1 and Num2 is : "+ (num1 - num2)); // - : used for Subtraction
        System.out.println("The Multiplication of Num1 and Num2 is : "+ (num1 * num2)); // * : used for Multiplication
        System.out.println("The Division of Num1 and Num2 is : "+ (num1 / num2)); // / : used for Division
        System.out.println("The Modulo of Num1 and Num2 is : "+ (num1 % num2)); // % : used for obtaining Remainder
    }
}