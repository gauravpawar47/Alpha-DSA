package Programs.Chapter_22;
import java.util.LinkedList;
import java.util.Queue;

public class Ch22_7_Question_Non_Repeating
{
    public static void nonRepeating(String str)
    {
        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;

            while(!queue.isEmpty() && freq[queue.peek()-'a'] > 1)
            {
                queue.remove();
            }

            if(queue.isEmpty())
            {
                System.out.print(-1 +" ");
            }
            else
            {
                System.out.print(queue.peek() +" ");
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "aabccxb";
        System.out.print("First Non Repeating Characters : ");
        nonRepeating(str);
    }
}