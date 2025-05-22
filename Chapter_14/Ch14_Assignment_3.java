package Programs.Chapter_14;

public class Ch14_Assignment_3
{
    static int sum = 0;

    public static int strLength(String str, int i)
    {
        if(i == str.length())
            return sum;

        sum += 1;
        return strLength(str, i + 1);
    }

    public static void main(String[] args)
    {
        // Q. Write a Program to find Length of a String using Recursion

        String str = "Gaurav";

        System. out.println("Length of String : "+ strLength(str, 0));
    }
}