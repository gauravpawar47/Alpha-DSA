public class _8_9_Remove_Operation
{
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;
    public static Node head;
    public static Node tail;

    public void addLast(int data)
    {
        // Step 1 : Create New Node
        Node newNode = new Node(data);
        size++;

        // Corner Case - Check If Linked List is Empty
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            // Step 2 : Link New Node to Tail
            tail.next = newNode;

            // Step 3 : Making New Node as Tail
            tail = newNode;
        }
    }

    public int removeFirst()
    {
        // Corner Case 1 : Check If Linked List is Empty
        if(size == 0)
        {
            return Integer.MIN_VALUE;
        }

        // Corner Case 2 : If Head and Tail are Same 
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Step 1 : Store the Value of Head
        int val = head.data;

        // Step 2 : Point the head to its Next
        head = head.next;

        size--;
        return val;
    }

    public int removeLast()
    {
        // Corner Case 1 : Check If Linked List is Empty
        if(size == 0)
        {
            return Integer.MIN_VALUE;
        }

        // Corner Case 2 : If Head and Tail are Same 
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Step 1 : Traverse Until Second last Node
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }

        // Step 2 : Make The next of It Null
        int val = temp.next.data;
        temp.next = null;

        // Step 3 : Make Tail to Temp;
        tail = temp;
        
        size--;
        return val;
    }

    public void print(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }



    public static void main(String[] args)
    {
        _8_9_Remove_Operation list = new _8_9_Remove_Operation();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);

        list.print(head);
        System.out.println("Size of Linked List : "+ size +"\n");

        System.out.println("Removed Element : "+ list.removeFirst());
        System.out.println("Size of Linked List : "+ size);
        list.print(head);
    
        System.out.println("\nRemoved Element : "+ list.removeLast());
        System.out.println("Size of Linked List : "+ size);
        list.print(head);
    }
}