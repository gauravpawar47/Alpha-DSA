package Programs.Chapter_22;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Ch22_Assignment_1
{
    public static void generate(int n)
    {
        Stack<Integer> stk = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int temp;

        for(int i = 1; i <= n; i++)
        {
            temp = i;
            while(temp > 0)
            { 
                int rem = temp % 2;
                temp /= 2;
                q.add(rem);
                stk.add(q.remove());
            }
            print(stk);
        }
    }

    public static void print(Stack<Integer> stk)
    {
        while(!stk.isEmpty())
        {
            System.out.print(stk.pop());
        }
        System.out.print(" ");
    }

    public static void main(String[] args)
    {
        // Q. Generate Binary Numbers

        int n = 5;

        System.out.print("Numbers : ");
        generate(n);
    }
}