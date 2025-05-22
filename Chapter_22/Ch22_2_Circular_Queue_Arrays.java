package Programs.Chapter_22;

public class Ch22_2_Circular_Queue_Arrays
{
    public static class Queue
    {
        static int size;
        static int arr[];
        static int rear;
        static int front;

        public Queue(int n)
        {
            arr = new int[n];
            size = n;
            front = rear = -1;
        }

        // Operation 1 : Check Underflow
        public static boolean isEmpty()
        {
            return front == -1 && rear == -1;
        }

        // Operation 2 : Check Overflow
        public static boolean isFull()
        {
            return (rear + 1) % size == front;
        }

        // Operation 3 : Insert Element
        public static void enqueue(int data)
        {
            // Step 1 : Check Overflow
            if(isFull())
            {
                System.out.println("\nQueue Is Full !\n");
                return;
            }

            // Step 2 : Check Whether its First Element
            if(front == -1 && rear == -1)
            {
                front = 0;
            }

            // Step 3 : Circular Increment
            rear = (rear + 1) % size;
            arr[rear] = data;
            System.out.println(arr[rear] +" Enqueued Successfully !");
        }

        // Operation 4 : Delete Element
        public static void dequeue()
        {
            // Step 1 : Check Underflow
            if(isEmpty())
            {
                System.out.println("\nQueue Is Empty !\n");
                return;
            }

            // Step 2 : Obtain front value
            int val = arr[front];

            // Step 3 : Deleting Last Element
            if(rear == front)
            {
                rear = front = -1;
            }
            else
            {
                front = (front + 1) % size;
            }
            System.out.println(val +" Dequeued Successfully !");
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("\nQueue Is Empty !\n");
                return -1;
            }
            return arr[front];
        }

        public static void print()
        {
            System.out.print("\nQueue Elements : ");
            for(int i = front; i <= rear; i++)
            {
                System.out.print(arr[i] +" ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Peek Element : "+ queue.peek());
        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Peek Element : "+ queue.peek());
        queue.print();
    }
}