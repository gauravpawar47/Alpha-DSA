package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_Assignment_2
{
    public static String simplifyPath(String path)
    {
        Stack<String> st = new Stack<>();
        String result = "";
        int n = path.length();
        result += "/";

        for(int i = 0; i < n; i++)
        {
            String dir = "";
            while(i < n && path.charAt(i) == '/')
            {
                i++;
            }
            while(i < n && path.charAt(i) != '/')
            {
                dir += path.charAt(i);
                i++;
            }

            if(dir.equals("..") == true)
            {
                if(!st.empty())
                {
                    st.pop();
                }
            }
            else if(dir.equals(".") == true)
            {
                continue;
            }
            else if(dir.length() != 0)
            {
                st.push(dir);
            }
        }

        Stack<String> st1 = new Stack<>();
        while(!st.isEmpty())
        {
            st1.push(st.pop());
        }

        while(!st1.isEmpty())
        {
            if(st1.size() != 1)
            {
                result += st1.pop() + '/';
            }
            else
            {
                result += st1.pop();
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        // Q. Simplify Path

        String str = new String("/a/./b/../../c/");
        String res = simplifyPath(str);
        System.out.println(res);
    }
}