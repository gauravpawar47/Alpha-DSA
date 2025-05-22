package Programs.Chapter_22;
import java.util.Deque;
import java.util.LinkedList;

public class Ch22_11_Deque_Stack
{
    public static class Stack
    {
        public static Deque<Integer> deque = new LinkedList<>();

        // Operation 1 : Push()
        public static void push(int data)
        {
            deque.addLast(data);
            System.out.println(data +" Pushed Successfully !");
        }

        // Operation 2 : Pop()
        public static void pop()
        {
            if(deque.isEmpty())
            {
                System.out.println("\nStack Is Empty !\n");
                return;
            }
            int val = deque.removeLast();
            System.out.println(val +" Popped Successfully !");
        }

        // Operation 3 : Peek()
        public static int peek()
        {
            if(deque.isEmpty())
            {
                System.out.println("\nStack Is Empty !\n");
                return -1;
            }
            return deque.getLast();
        }
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("\nStack Elements : "+ stack.deque);
        System.out.println("Peak  Elements : "+ stack.peek() +"\n");

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("\nStack Elements : "+ stack.deque);
        System.out.println("Peak  Elements : "+ stack.peek() +"\n");
    }
}