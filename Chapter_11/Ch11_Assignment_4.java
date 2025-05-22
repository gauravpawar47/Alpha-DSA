package Programs.Chapter_11;

public class Ch11_Assignment_4
{
    public static boolean isAnagram(String str1, String str2)
    {
        int count = 0;
        int max = Math.max(str1.length(), str2.length());

        if(str1.length() == str2.length())
        {
            for(int i = 0; i < max; i++)
            {
                for(int j = 0; j < max; j++)
                {
                    if(Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str1.charAt(i)))
                        count++;
                }
            }
            return count == max;
        }

        return false;
    }

    public static void main(String []args)
    {
        // Q. Determine if 2 Strings are anagrams of each other

        String str1 = "race";
        String str2 = "care";

        boolean result = isAnagram(str1, str2);
        System.out.println("Status : "+ result);
    }
}