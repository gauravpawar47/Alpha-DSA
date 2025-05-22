package Programs.Chapter_8;
import java.util.Scanner;

public class Ch8_02_Array_Operation
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int marks[] = new int[3]; // Creation

        for(int i = 0; i < marks.length; i++) // Input
        {
            System.out.print("Enter the marks of sub"+(i+1) +" : ");
            marks[i] = input.nextInt();
        }

        for(int i = 0; i < marks.length; i++) // Output
        {
            System.out.println("Marks of sub"+ (i+1) +" is : "+ marks[i]);
        }

        int average = (marks[0] + marks[1] + marks[2]) / 3; // Update
        System.out.println("Percentage is : "+ average);
    }
}