package Programs.Chapter_3;
import java.util.Scanner;

public class Ch3_09_Switch_Statements
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you're Choice  : ");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1 :
                System.out.println("Mango Shake is ordered");
                break;
            case 2 :
                System.out.println("Banana Shake is ordered");
                break;
            case 3 :
                System.out.println("Pineapple Shake is ordered");
                break;
            default :
                System.out.println("Wake Up to the Reality ..!!");
        }
    }
}