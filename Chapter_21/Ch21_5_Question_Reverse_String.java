package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_5_Question_Reverse_String
{
    public static String reverseString(String str)
    {
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while(i < str.length())
        {
            stack.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        String str = "ABCD";

        System.out.println("String Before Reverse : "+ str);
        System.out.println("String After  Reverse : "+ reverseString(str));
    }
}