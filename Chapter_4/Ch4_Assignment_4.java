package Programs.Chapter_4;
import java.util.Scanner;

public class Ch4_Assignment_4
{
    public static void main(String[] args)
    {
        // Q. Write a program to print the multiplication table of a number N, entered by the user

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        System.out.println("The table of "+ num+ "\n");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num +" X "+ i +" : "+ (num * i));
        }
    }
}