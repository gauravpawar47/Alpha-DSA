package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_Assignment_2
{
    public static void main(String[] args)
    {
        // Q. In a Program, Input the side of square. You have to output the area of the square

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of Square : ");
        float side = input.nextFloat();

        System.out.println("The Area of Square is : "+ (side * side));
    }
}