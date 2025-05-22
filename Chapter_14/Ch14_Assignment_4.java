package Programs.Chapter_14;

public class Ch14_Assignment_4
{
    public static int countSubtras(String str, int i, int j, int n)
    {
        if(n == 1)
            return 1;
        if(n <= 0)
            return 0;

        int result = countSubtras(str, i + 1, j, n - 1) + countSubtras(str, i, j - 1, n - 1) - countSubtras(str,
                i + 1, j - 1, n - 2);

        if(str.charAt(i) == str.charAt(j))
            result += 1;

        return result;
    }

    public static void main(String[] args)
    {
        // Q. We are given a string S, we need to find the count of all contigous substrings starting and ending with same character

        String str = "abcab";
        int n = str.length();
        System.out.println(countSubtras(str, 0, n - 1, n));
    }
}