package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_6_Question_Reverse_Stack
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

    public static void reverseStack(Stack<Integer> stack)
    {
        // Base case
        if(stack.isEmpty())
        {
            return;
        }

        // Recursion
        int top = stack.pop();
        reverseStack(stack);
        pushBottom(stack, top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Before Reversing : "+ stack);
        reverseStack(stack);
        System.out.println("After  Reversing : "+ stack);
    }
}