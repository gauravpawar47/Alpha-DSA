package Programs.Chapter_19;

public class Ch19_8_Remove_First
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

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data)
    {
        // Step 1 : Create a New Node
        Node newNode = new Node(data);
        size++;

        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        // Step 2 : Next of New Node points to Head
        newNode.next = head;

        // Step 3 : Assigning head to newNode
        head = newNode;
    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("Linked List Is Empty");
            return Integer.MAX_VALUE;
        }
        else if(size == 1)
        {
            size = 0;
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
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
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Ch19_8_Remove_First obj1 = new Ch19_8_Remove_First();

        obj1.addFirst(10);
        obj1.addFirst(20);
        obj1.addFirst(30);
        obj1.addFirst(40);
        obj1.addFirst(50);
        obj1.print(head);

        obj1.removeFirst();
        obj1.print(head);
    }
}