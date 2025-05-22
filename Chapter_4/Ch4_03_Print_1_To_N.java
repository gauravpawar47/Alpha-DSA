package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_03_Print_1_To_N
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i = 1;

        System.out.print("Enter the Range : ");
        int n = input.nextInt();

        while(i <= n)
        {
            System.out.print(i +" ");
            i++;
        }
    }
}