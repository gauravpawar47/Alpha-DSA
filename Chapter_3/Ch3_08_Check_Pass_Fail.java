package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_08_Check_Pass_Fail
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Marks : ");
        int marks = input.nextInt();

        String reportCard = (marks >= 35) ? "You're Passed !!" : "You're Failed !!";
        System.out.println(reportCard);
    }
}