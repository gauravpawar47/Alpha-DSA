package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_7_Question_Stocks_Span
{
    public static void stocksSpan(int stock[], int span[])
    {
        Stack<Integer> stack = new Stack<>(); // Push Index
        span[0] = 1; // Span
        stack.push(0);

        for(int i = 1; i < stock.length; i++)
        {
            int currPrice = stock[i]; // Stock Contain Price
            while(!stack.isEmpty() && currPrice > stock[stack.peek()])
            {
                stack.pop();
            }

            // Stack Becomes Empty
            if(stack.isEmpty())
            {
                span[i] = i + 1;
            }
            else
            {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }
            stack.push(i); // Push Index onto stack
        }
    }

    public static void print(int[] arr, String str)
    {
        System.out.print(str +" : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        stocksSpan(stocks, span);

        print(stocks, "Stocks");
        print(span, "Spans ");
    }
}