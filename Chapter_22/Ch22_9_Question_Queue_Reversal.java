package Programs.Chapter_22;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Ch22_9_Question_Queue_Reversal
{
    public static Queue<Integer> queueReversal(Queue<Integer> queue)
    {
        Stack<Integer> stack = new Stack<>();

        // Step 1 : Shift Elements from Queue to Stack
        while(!queue.isEmpty())
        {
            stack.push(queue.remove());
        }

        // Step 2 : Again Shift Elements from Stack to Queue
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }

        return queue;
    }

    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue Before Reversing : "+ queue);
        System.out.println("Queue After  Reversing : "+ queueReversal(queue));
    }
}