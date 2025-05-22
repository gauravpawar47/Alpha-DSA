package Programs.Chapter_22;

public class Ch22_3_Question_Queue_LL
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue
    {
        static Node head = null;
        static Node tail = null;

        // Operation 0 : Check Underflow
        public static boolean isEmpty()
        {
            return head == null && tail == null;
        }

        // Operation 1 : Insert Element
        public static void enqueue(int data)
        {
            // Step 1 : Create a New Node
            Node newNode = new Node(data);

            if(head == null)
            {
                head = tail = newNode;
                System.out.println(tail.data +" Enqueued Successfully !");
                return;
            }

            // Step 2 : Linking newNode to tail
            tail.next = newNode;

            // Step 3 : Making newNode as tail
            tail = newNode;
            System.out.println(tail.data +" Enqueued Successfully !");
        }

        // Operation 2 : Remove Element
        public static void dequeue()
        {
            // Step 1 : Check Underflow
            if(isEmpty())
            {
                System.out.println("Queue Is Empty !");
                return;
            }

            // Step 2 : Obtain head value
            int front = head.data;

            // Step 3 : Deleting Single Node
            if(tail == head)
            {
                tail = head = null;
            }
            else
            {
                head = head.next;
            }

            System.out.println(front +" Dequeued Successfully !");
        }

        // Operation 3 : Top Most Element
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue Is Empty !");
                return -1;
            }

            return head.data;
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
        System.out.println("\nPeek Element : "+ queue.peek() +"\n");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("\nPeek Element : "+ queue.peek() +"\n");
    }
}