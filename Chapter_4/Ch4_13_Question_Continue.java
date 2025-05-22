package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_13_Question_Continue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("Enter a Number : ");
            int num = input.nextInt();

            if(num % 10 == 0)
                continue;
            System.out.println("The Number is : "+ num +"\n");
        }while (true);
    }
}