import java.util.Scanner;

public class _5_Sum_N_Natural
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int sum = 0;

        System.out.print("Enter a Value N : ");
        int n = input.nextInt();

        while(i <= n)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum : "+ sum);
    }
}