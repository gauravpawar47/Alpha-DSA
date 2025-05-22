package Programs.Chapter_30;
import java.util.HashMap;

public class Ch30_7_Valid_Anagram
{
    public static boolean isAnagram(String s, String t)
    {
        // Step 0 : If length is not equal of both string
        if(s.length() != t.length())
        {
            return false;
        }

        // Step 1 : Add Character along with Frequency in Map
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Step 2 : Validating Frequency of Each element from t string
        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(map.get(ch) != null)
            {
                if(map.get(ch) == 1)
                {
                    map.remove(ch);
                }
                else
                {
                    map.put(ch, map.get(ch) - 1);
                }
            }
            else
            {
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args)
    {
        String s = "care";
        String t = "race";

        System.out.println("S : "+ s);
        System.out.println("T : "+ t);
        System.out.println("Anagram : "+ isAnagram(s, t));
    }
}