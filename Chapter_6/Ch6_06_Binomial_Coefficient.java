package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_06_Binomial_Coefficient
{
    public static int factorial(int n)
    {
        int factorial = 1;

        for(int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static int binomialCoefficient(int n, int r)
    {
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nrFactorial = factorial(n - r);

        return nFactorial / (rFactorial * nrFactorial);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for n : ");
        int n = input.nextInt();

        System.out.print("Enter the value for r : ");
        int r = input.nextInt();

        System.out.println("The Binomial Coefficient is : "+ binomialCoefficient(n, r));
    }
}