package Programs.Chapter_22;
import java.util.LinkedList;
import java.util.Queue;

public class Ch22_6_Question_Stack_2_Queues
{
    public static class Stack
    {
        public static Queue<Integer> q1 = new LinkedList<>();
        public static Queue<Integer> q2 = new LinkedList<>();

        // Operation 0 : Check Underflow
        public static boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Operation 1 : Insert Element
        public static void push(int data)
        {
            if(!q1.isEmpty())
            {
                q1.add(data);
            }
            else
            {
                q2.add(data);
            }
            System.out.println(data +" Pushed Successfully !");
        }

        // Operation 2 : Remove Element
        public static void pop()
        {
            if(isEmpty())
            {
                System.out.println("\nStack Underflow !\n");
                return;
            }

            int top = -1;
            if(!q1.isEmpty())
            {
                while (!q1.isEmpty())
                {
                    top = q1.remove();
                    if(q1.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }
            }
            else
            {
                while(!q2.isEmpty())
                {
                    top = q2.remove();
                    if(q2.isEmpty())
                    {
                        break;
                    }
                    q1.add(top);
                }
            }
            System.out.println(top  +" Popped Successfully !");
        }

        // Operation 3 : Peek Element
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("\nStack Underflow !\n");
                return -1;
            }

            int top = -1;
            if(!q1.isEmpty())
            {
                while (!q1.isEmpty())
                {
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else
            {
                while(!q2.isEmpty())
                {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
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

        System.out.println("\nQueue Elements : "+ stack.q2);
        System.out.println("Peek  Element  : "+ stack.peek() +"\n");

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("\nQueue Elements : "+ stack.q2);
        System.out.println("Peek  Element  : "+ stack.peek() +"\n");
    }
}