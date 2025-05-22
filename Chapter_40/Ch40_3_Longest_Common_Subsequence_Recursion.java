package Programs.Chapter_40;

public class Ch40_3_Longest_Common_Subsequence_Recursion
{
    public static int lcsRecursion(String str1, String str2, int n, int m)
    {
        if(n == 0 || m == 0)
        {
            return 0;
        }

        if(str1.charAt(n - 1) == str2.charAt(m - 1))
        {
            return  lcsRecursion(str1, str2, n - 1, m - 1) + 1;
        }

        else
        {
            return Math.max(lcsRecursion(str1, str2, n - 1, m), lcsRecursion(str1, str2, n, m - 1));
        }
    }

    public static void main(String[] args)
    {
        String str1 = "abcdge";
        String str2 = "abedg";

        System.out.println("Longest Common Subsequence : "+ lcsRecursion(str1, str2, str1.length(), str2.length()));
    }
}