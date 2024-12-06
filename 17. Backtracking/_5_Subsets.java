public class _5_Subsets
{
    public static void findSubsets(String str, String result, int i)
    {
        // Step 1 : Base-Case
        if(i == str.length())
        {
            if(result.length() == 0)
            {
                System.out.println("EMPTY");
            }
            else
            {
                System.out.println(result);
            }
            return;
        }

        // Step 2 & 3 : Kaam & Inner Function Call
        findSubsets(str, result + str.charAt(i), i+1); // Yes
        findSubsets(str, result, i+1); // No
    }

    public static void main(String[] args)
    {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}