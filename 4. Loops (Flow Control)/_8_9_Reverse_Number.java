import java.util.Scanner;

public class _8_9_Reverse_Number
{
    public static void main(String[] args)
    {  
        Scanner input = new Scanner(System.in);
        int rev = 0;

        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        while(n > 0)
        {
            int lastDigit = n % 10;
            rev = (rev + lastDigit) * 10;
            n /= 10; 
        }
        rev /= 10;

        System.out.println("Reversed : "+ rev);
    }
}