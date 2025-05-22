package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_10_Duplicate_Parenthesis
{
    public static boolean isDuplicate(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ')') // Closing
            {
                int count = 0;
                while(stack.pop() != '(')
                {
                    count++;
                }

                if(count == 0)
                {
                    return true;
                }
            }
            else
            {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        String str = "((a+b)+(c+d))";
        System.out.println("Is Duplicate : "+ isDuplicate(str));
    }
}