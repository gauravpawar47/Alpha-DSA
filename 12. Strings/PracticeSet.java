import java.util.Arrays;

public class PracticeSet
{
    public static int noOfVowels(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count += 1;
            }
        }
        return count;
    }

    public static boolean isAnagram(String str1, String str2)
    {
        if(str1.length() ==  str2.length())
        {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
        
            char[] str1Char = str1.toCharArray();
            char[] str2Char = str2.toCharArray();
        
            Arrays.sort(str1Char);
            Arrays.sort(str2Char);

            return Arrays.equals(str1Char, str2Char);
        }
        return false;
    }

    public static void main(String[] args)
    {
        // Q 1. No of Times Lowercase Vowels Occurred 

        String str = "Gaurav";
        System.out.println("No Of Vowels : "+ noOfVowels(str));
    
        // Q 2. Output

        // --> False, True

        // Q 3. Output

        // --> ApnaCoege

        // Q 4. Check Anagrams Of String

        String str1 = "earth";
        String str2 = "heart";

        System.out.println("Is Anagrams : "+ isAnagram(str1, str2));

        // Q 5. Reading Material (Intern() & StringBuffer)
    }
}