package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_Assignment_3
{
    public static String decodeString(String s)
    {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> results = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int idx = 0;

        while(idx < s.length())
        {
            char ch = s.charAt(idx);

            if(Character.isDigit(ch))
            {
                int count = 0;
                while(idx < s.length() && Character.isDigit(ch))
                {
                    count = count * 10 + (ch - '0');
                    idx++;

                    if(idx < s.length())
                    {
                        ch = s.charAt(idx);
                    }
                }

                counts.push(count);
            }

            else if(ch == '[')
            {
                results.push(curr);
                curr = new StringBuilder();
                idx++;
            }

            else if(ch == ']')
            {
                StringBuilder temp = curr;
                curr = results.pop();
                int repetition = counts.pop();

                for(int i = 0; i < repetition; i++)
                {
                    curr.append(temp);
                }
                idx++;
            }

            else
            {
                curr.append(ch);
                idx++;
            }
        }

        return curr.toString();
    }

    public static void main(String []args)
    {
        String str = "3[a]2[bc]";

        System.out.println("Decode : "+ decodeString(str));
    }
}