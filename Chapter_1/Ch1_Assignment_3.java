package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_Assignment_3
{
    public static void main(String[] args)
    {
        // Q. Enter cost of 3 items from the user (using float data type) - a pencil, pen and eraser. You have to
        // output the total cost of the items back to the user as  their bill . (Add : you can also try adding 18%
        // gst tax to the items in the bill as an advanced problem)

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cost of Pencil : ");
        float pencil = input.nextFloat();

        System.out.print("Enter the cost of Pen : ");
        float pen = input.nextFloat();

        System.out.print("Enter the cost of Eraser : ");
        float eraser = input.nextFloat();

        float totalAmount = pencil + pen + eraser;
        System.out.println("The Total cost of Items including 18% GST is : "+ (totalAmount + (totalAmount) * 18 / 100));
    }
}