import java.util.Scanner;

public class _6_Check_Palindrome
{
    public static boolean isPalindrome(String str)
    {
        for(int i = 0; i < str.length() / 2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String str = input.nextLine();

        System.out.println("String Palindrome : "+ isPalindrome(str));
    }
}