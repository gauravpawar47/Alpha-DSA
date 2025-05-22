package Programs.Chapter_11;
import java.util.Scanner;

public class Ch11_Assignment_1
{
    public static int noOfVowels(String str)
    {
        int result = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'))
                result++;
        }

        return result;
    }

    public static void main(String []args)
    {
        // Q. Count how many times lowercase vowels occurred in a String entered by the user

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = input.nextLine();

        int vowels = noOfVowels(str);
        System.out.println("Number of Vowels in string : "+ vowels);
    }
}