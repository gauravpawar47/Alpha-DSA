package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_10_Calculator
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value for A : ");
        int a = input.nextInt();

        System.out.print("Enter the Value for B : ");
        int b = input.nextInt();

        System.out.print("Enter the Operation : ");
        char operation = input.next().charAt(0);

        System.out.println();
        switch (operation)
        {
            case '+' :
                System.out.println("The Addition is : "+ (a + b));
                break;
            case '-' :
                System.out.println("The Subtraction is : "+ (a - b));
                break;
            case '*' :
                System.out.println("The Multiplication is : "+ (a * b));
                break;
            case '/' :
                System.out.println("The Division is : "+ (a / b));
                break;
            case '%' :
                System.out.println("The Modulo is : "+ (a % b));
                break;
            default :
                System.out.println("Invalid Input ..!");
                break;
        }
    }
}