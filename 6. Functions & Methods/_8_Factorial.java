import java.util.Scanner;

public class _8_Factorial
{
    public static int factorial(int n)
    {   
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
 
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        System.out.println("Factorial of "+ n +" is : "+ factorial(n));
    }
}