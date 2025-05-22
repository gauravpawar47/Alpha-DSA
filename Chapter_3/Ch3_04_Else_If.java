package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_04_Else_If
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Age : ");
        int age = input.nextInt();

        if(age >= 1 && age < 3)
            System.out.println("You're a Baby");
        else if(age >= 3 && age < 13)
            System.out.println("You're a Kid");
        else if(age >= 13 && age < 18)
            System.out.println("You're a Teenager");
        else if(age >= 18)
            System.out.println("You're a Adult");
        else
            System.out.println("Invalid Input");
    }
}