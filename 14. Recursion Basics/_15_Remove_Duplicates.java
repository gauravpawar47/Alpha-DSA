public class _15_Remove_Duplicates
{
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map)
    {
        // Base-Case
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }

        // Kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true)
        {
            // Duplicate
            removeDuplicates(str, idx + 1, newStr, map);    
        }
        else
        {
            // Add Character
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args)
    {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}