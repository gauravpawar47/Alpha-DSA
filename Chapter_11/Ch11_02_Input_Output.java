package Programs.Chapter_11;
import java.util.Scanner;

public class Ch11_02_Input_Output
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.println(name);
    }
}