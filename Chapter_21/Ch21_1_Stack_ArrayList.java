package Programs.Chapter_21;
import java.util.ArrayList;

public class Ch21_1_Stack_ArrayList
{
    static class Stack
    {
        static ArrayList<Integer> list = new ArrayList<>();

        // Operation 0 - isEmpty()
        public static boolean isEmpty()
        {
            return list.size() == 0;
        }

        // Operation 1 - push()
        public static void push(int data)
        {
            list.add(data);
            System.out.println(data +" Pushed Successfully !");
        }

        // Operation 2 - pop()
        public static void pop()
        {
            if(isEmpty())
            {
                System.out.println("\nStack Underflow !\n");
                return;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            System.out.println(top +" Popped Successfully !");
        }

        // Operation 3 - peeK()
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("\nStack Underflow !\n");
                return  -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String []args)
    {
        Stack obj = new Stack();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println("\nPeek Element : "+ obj.peek() +"\n");

        obj.pop();
        obj.pop();
        obj.pop();
        System.out.println("\nPeek Element : "+ obj.peek() +"\n");
    }
}