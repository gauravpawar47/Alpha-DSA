package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_04_Sum_Of_N_Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i = 1;

        System.out.print("Enter the Range : ");
        int range = input.nextInt();

        while(i <= range)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum of Given Range : "+ sum);
    }
}