package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_01_If_Else
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Age : ");
        int age = input.nextInt();

        if(age >= 18)
            System.out.println("You're Adult");
        else
            System.out.println("You're Not Adult");
    }
}