package Programs.Chapter_22;
import java.util.Stack;

public class Ch22_5_Question_Queue_2_Stacks
{
    public static class Queue
    {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Operation 0 : Check Underflow
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }

        // Operation 1 : Insert Element
        public static void enqueue(int data)
        {
            // Step 1 : Transfer Elements from s1 to s2
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }

            // Step 2 : Insert element in s1
            s1.push(data);
            System.out.println(data +" Enqueued Successfully !");

            // Step 3 : Transfer Elements from s2 to s1
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }

        // Question 2 : Remove Element
        public static void dequeue()
        {
            // Step 1 : Check Underflow
            if(isEmpty())
            {
                System.out.println("\nQueue is Empty !\n");
                return;
            }

            int val = s1.peek();
            System.out.println(val +" Dequeued Successfully !");
            s1.pop();
        }

        // Operation 3 : Top Most Element
        public static int peek()
        {
            // Step 1 : Check Underflow
            if(isEmpty())
            {
                System.out.println("\nQueue is Empty !\n");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("\nQueue Element : "+ queue.s1);
        System.out.println("Peek  Element : "+ queue.peek() +"\n");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("\nQueue Element : "+ queue.s1);
        System.out.println("Peek  Element : "+ queue.peek() +"\n");
    }
}