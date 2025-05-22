package Programs.Chapter_2;
import java.util.Scanner;

public class Ch2_05_Assignment_Operators
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a : ");
        int a = input.nextInt();

        System.out.println("The Original Value of a : "+ a);
        System.out.println("\nThe Addition Value of a : "+ (a += 2));
        System.out.println("The Subtraction Value of a : "+ (a -= 2));
        System.out.println("The Multiplication Value of a : "+ (a *= 2));
        System.out.println("The Division Value of a : "+ (a /= 2));
        System.out.println("The Modulo Value of a : "+ (a %= 2));

        /*
         * += --> used to add the given value in the variable
         * -= --> used to subtract the given value in the variable
         * *= --> used to multiply the given value in the variable
         * /= --> used to divide the given value in the variable
         * %= --> used to modulo the given value in the variable
        */
    }
}