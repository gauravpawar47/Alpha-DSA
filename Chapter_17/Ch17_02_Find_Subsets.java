package Programs.Chapter_17;

public class Ch17_02_Find_Subsets
{
    public static void findSubsets(String str, String result, int i)
    {
        // basecase
        if(i == str.length())
        {
            if(str.length() == 0)
                System.out.println("null");
            else
            {
                System.out.println(result);
                return;
            }
        }

        // Yes Choice
        findSubsets(str, result + str.charAt(i), i + 1);

        // No Choice
        findSubsets(str, result, i + 1);
    }

    public static void main(String[] args)
    {
        String str = "abc";

        findSubsets(str, "", 0);
    }
}