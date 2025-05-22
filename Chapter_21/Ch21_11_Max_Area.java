package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_11_Max_Area
{
    public static int maxArea(int arr[])
    {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Step 1 : Next Smaller Right O(n)
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                nsr[i] = arr.length;
            }
            else
            {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        // Step 2 : Next Smaller Left O(n)
        stack = new Stack<>();

        for(int i = 0; i < arr.length; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                nsl[i] = -1;
            }
            else
            {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        // Step 3 : Current Area - width = j - i - 1 = nsr[i] - nsl[i] - 1 O(n)

        for(int i = 0; i < arr.length; i++)
        {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;

            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println("Maximum Area : "+ maxArea(arr));
    }
}