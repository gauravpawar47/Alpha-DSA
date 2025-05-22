package Programs.Chapter_22;
import java.util.*;

public class Ch22_4_Queue_JCF
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue Elements : "+ queue);
        System.out.println("Peek  Element  : "+ queue.peek());

        queue.remove(); // dequeued 10
        queue.remove(); // dequeued 20
        queue.remove(); // dequeued 30

        System.out.println("Queue Elements : "+ queue);
        System.out.println("Peek  Element  : "+ queue.peek());
    }
}