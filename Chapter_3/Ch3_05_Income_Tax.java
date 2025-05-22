package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_05_Income_Tax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Annual Income in LPA : ");
        float income = input.nextFloat();

        if(income < 5.00f)
            System.out.println("Your Annual Income Tax : 0.00%");
        else if(income >= 5.00f && income < 10.00f)
            System.out.println("Your Annual Income Tax : "+ (income * 0.2f));
        else
            System.out.println("Your Annual Income Tax : "+ (income * 0.3f));
    }
}