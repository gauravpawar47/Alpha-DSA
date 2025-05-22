package Programs.Chapter_22;

public class Ch22_1_Queue_Arrays
{
    public static class Queue
    {
        static int[] arr;
        static int size;
        static int rear;

        public Queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Operation 0 : isEmpty()
        public static boolean isEmpty()
        {
            return rear == -1;
        }

        // Operation 1 : Insert Operation
        public static void enqueue(int data)
        {
            // Step 1 : Check Overflow
            if(rear == size - 1)
            {
                System.out.println("\nQueue Is Full !\n");
                return;
            }

            // Step 2 : Increment Rear
            rear++;

            // Step 3 : Add it to Queue
            arr[rear] = data;
            System.out.println(arr[rear] +" Enqueued Successfully !");
        }

        // Operation 2 : Remove Operation
        public static void dequeue()
        {
            // Step 1 : Check Underflow
            if(isEmpty())
            {
                System.out.println("\nQueue Is Empty !\n");
                return;
            }

            // Step 2 : Store Front
            int front = arr[0];

            // Step 3 : Rearrange the array Elements
            for(int i = 0; i < rear; i++)
            {
                arr[i] = arr[i + 1];
            }

            // Step 4 : Decrement Rear
            rear = rear - 1;
            System.out.println(front +" Dequeued Successfully !");
        }

        // Operation 3 : Peek Operation
        public static int peek()
        {
            return arr[0];
        }

        // Operation 4 : Print Operation
        public static void print()
        {
            System.out.print("\nQueue Elements : ");
            for(int i = 0; i <= rear; i++)
            {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
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
        queue.print();

        System.out.println("\nPeek Element : "+ queue.peek() +"\n");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();

        System.out.println("\nPeek Element : "+ queue.peek());
    }
}