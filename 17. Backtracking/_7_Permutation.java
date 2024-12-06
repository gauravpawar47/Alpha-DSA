public class _7_Permutation
{
    public static void findPermutation(String str, String result)
    {
        // Step 1 : Base-Case
        if(str.length() == 0)
        {
            System.out.println(result);
            return;
        }

        // Step 2 : Kaam
        for(int i = 0; i < str.length(); i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Step 3 : Inner Function Call
            findPermutation(newStr, result + curr);
        }
    }

    public static void main(String[] args)
    {
        String str = "abc";
        findPermutation(str, "");
    }
}