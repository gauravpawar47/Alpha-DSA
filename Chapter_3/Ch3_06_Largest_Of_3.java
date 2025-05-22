package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_06_Largest_Of_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value for A : ");
        int a = input.nextInt();

        System.out.print("Enter the Value for B : ");
        int b = input.nextInt();

        System.out.print("Enter the Value for C : ");
        int c = input.nextInt();

        System.out.println("\nThe Value of A : "+ a);
        System.out.println("The Value of B : "+ b);
        System.out.println("The Value of C : "+ c +"\n");

        // Logic - 1

        if(a >= b && a >= c)
            System.out.println("A is Greatest Number");
        else if(b >= c)
            System.out.println("B is Greatest Number");
        else
            System.out.println("C is Greatest Number");


        // Logic - 2

        /*
        if(a > b)
        {
            if(a > c)
                System.out.println("A is Greatest Number");
            else if(c > b)
                System.out.println("C is Greatest Number");
        }
        else
        {
            if(b > c)
                System.out.println("B is Greatest Number");
            else
                System.out.println("C is Greatest Number");
        }
        */
    }
}