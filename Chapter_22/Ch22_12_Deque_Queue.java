package Programs.Chapter_22;
import java.util.Deque;
import java.util.LinkedList;

public class Ch22_12_Deque_Queue
{
    public static class Queue
    {
        public static Deque<Integer> deque = new LinkedList<>();

        // Operation 1 : Add()
        public static void add(int data)
        {
            deque.addLast(data);
            System.out.println(data +" Enqueued Successfully !");
        }

        // Operation 2 : Remove()
        public static void remove()
        {
            if(deque.isEmpty())
            {
                System.out.println("\nQueue Is Empty !\n");
                return;
            }
            int val = deque.removeFirst();
            System.out.println(val +" Dequeued Successfully !");
        }

        // Operation 3 : Peek();
        public static int peek()
        {
            if(deque.isEmpty())
            {
                System.out.println("\nQueue Is Empty !\n");
                return -1;
            }
            return deque.getFirst();
        }
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("\nQueue Elements : "+ queue.deque);
        System.out.println("Peek  Element  : "+ queue.peek() +"\n");

        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println("\nQueue Elements : "+ queue.deque);
        System.out.println("Peek  Element  : "+ queue.peek() +"\n");
    }
}