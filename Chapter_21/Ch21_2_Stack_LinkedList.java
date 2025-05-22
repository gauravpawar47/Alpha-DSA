package Programs.Chapter_21;

public class Ch21_2_Stack_LinkedList
{
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack
    {
        static Node head = null;

        // Operation 0 - isEmpty()
        public static boolean isEmpty()
        {
            return head == null;
        }

        // Operation 1 - push()
        public static void push(int data)
        {
            // Step 1 : Create a New Node
            Node newNode = new Node(data);

            if(isEmpty())
            {
                System.out.println(data +" Pushed Successfully !");
                head = newNode;
                return;
            }

            // Step 2 : Linked New Node to head
            newNode.next = head;

            // Step 3 : Updating head to New Node
            head = newNode;
            System.out.println(data +" Pushed Successfully !");
        }

        // Operation 2 - pop()
        public static void pop()
        {
            // Step 1 - Check isEmpty()
            if(isEmpty())
            {
                System.out.println("\nStack Underflow !\n");
                return;
            }

            // Step 2 - Store current head value
            int top = head.data;

            // Step 3 - Moving head to its next node;
            head = head.next;
            System.out.println(top +" Popped Successfully !");
        }

        // Operation 3 - peek()
        public static int peek()
        {
            // Step 1 - Check isEmpty()
            if(isEmpty())
            {
                System.out.println("\nStack Underflow !\n");
                return - 1;
            }
            return head.data;
        }
    }

    public static void main(String[] args)
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