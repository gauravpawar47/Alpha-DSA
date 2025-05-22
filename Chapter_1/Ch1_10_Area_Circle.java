package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_10_Area_Circle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        float radius = input.nextFloat();

        System.out.println("The Area of Circle is : "+ (3.14f * radius * radius) +" sq.m");
    }
}