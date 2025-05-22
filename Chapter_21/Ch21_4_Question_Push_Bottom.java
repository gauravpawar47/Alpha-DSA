package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_4_Question_Push_Bottom
{
    public static void pushBottom(Stack<Integer> stack, int data)
    {
        // Base Case
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }

        // Recursion
        int top = stack.pop();
        pushBottom(stack, data);
        stack.push(top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Before Adding 6 : "+ stack);
        pushBottom(stack, 6);
        System.out.println("After  Adding 6 : "+ stack);
    }
}