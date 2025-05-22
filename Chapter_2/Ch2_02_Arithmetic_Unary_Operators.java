package Programs.Chapter_2;
import java.util.Scanner;

public class Ch2_02_Arithmetic_Unary_Operators
{
    public static void main(String []args)
    {
         Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a : ");
        int a = input.nextInt();

        ++a; // increment and then make use
        System.out.println("\nThe Pre-Increment of a is : "+ (a));

        a++; // use and then make increment
        System.out.println("The Post-Increment of a is : "+ (a) +"\n");

        --a; // decrement and then make use
        System.out.println("\nThe Pre-Decrement of a is : "+ (a));

        a--; // use and then make decrement
        System.out.println("The Post-Decrement of a is : "+ (a) +"\n");
    }
}