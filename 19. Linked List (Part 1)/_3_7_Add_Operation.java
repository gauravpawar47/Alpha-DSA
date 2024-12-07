public class _3_7_Add_Operation
{
    public static class Node
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

    public void addFirst(int data)
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
            // Step 2 : Link New Node to Head
            newNode.next = head;

            // Step 3 : Making New Node as Head
            head = newNode;
        }
    }

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

    public void addMiddle(int data, int idx)
    {
        // Corner Case - List  is Empty
        if(idx == 0)
        {
            addFirst(data);
            return;
        }

        // Step 1 : Create a New Node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; 

        // Step 2 : Traverse Till index - 1
        while(i < idx - 1)
        {
            temp = temp.next;
            i++;
        }

        // Step 3 : Point New Node of Next to Temp of Next
        newNode.next = temp.next;
        
        // Step 4 : Point Temp of Next to New Node;
        temp.next = newNode;
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
        _3_7_Add_Operation list = new _3_7_Add_Operation();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addMiddle(100, 2);

        list.print(head);
        System.out.println("Size of Linked List : "+ size);
    }
}