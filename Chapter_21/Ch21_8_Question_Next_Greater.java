package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_8_Question_Next_Greater
{
    public static void main(String[] args)
    {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--)
        {
            // Step 1 : While Loop
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
            {
                stack.pop();
            }

            // Step 2 : If-Else
            if(stack.isEmpty())
            {
                nextGreater[i] = -1;
            }
            else
            {
                nextGreater[i] = arr[stack.peek()];
            }

            // Step 3 - Push
            stack.push(i);
        }

        System.out.print("Next Greater : ");
        for(int i = 0; i < nextGreater.length; i++)
        {
            System.out.print(nextGreater[i] +" ");
        }
        System.out.println();
    }
}