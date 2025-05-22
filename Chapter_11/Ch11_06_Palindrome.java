package Programs.Chapter_11;

public class Ch11_06_Palindrome
{
    public static boolean isPalindrome(String str)
    {
        for(int i = 0; i < str.length() / 2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String []args)
    {
        String str = "Noon";

        boolean result = isPalindrome(str.toLowerCase());
        System.out.println(
                result);
    }
}