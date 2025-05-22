package Programs.Chapter_11;
import java.util.Scanner;

public class Ch11_Assignment_5
{
    public static void main(String []args)
    {
        // Q. Search and read about
        /*
            1. intern()
            2. StringBuffer
         */

        // 1. Intern()

        String str1 = new String("Gaurav");
        String str2 = "Gaurav";
        String str3 = str1.intern();

        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        // 2. StringBuffer

        Scanner input = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Gaurav ");

        System.out.print("Enter a String to append : ");
        String str = input.next();

        sb.append(str);
        System.out.println(sb);
    }
}