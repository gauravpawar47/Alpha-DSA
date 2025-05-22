package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_9_Question_Valid_Parenthesis
{
    public static boolean isValid(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                if((stack.peek() == '(' && ch == ')') || (stack.peek() == '[' && ch == ']') || (stack.peek() == '{' && ch == '}'))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        String str = "{[(())]}";

        System.out.println("Is Valid : "+ isValid(str));
    }
}