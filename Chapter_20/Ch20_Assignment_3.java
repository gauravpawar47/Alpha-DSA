package Programs.Chapter_20;

public class Ch20_Assignment_3
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

    public static void addLast(int data)
    {
        // Step 1 : Create a New Node
        Node newNode = new Node(data);

        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        // Step 2 : Next of Tail point to New Node
        tail.next = newNode;

        // Step 3 : Assigning tail to newNode
        tail = newNode;

        // Step 4 : Making next of tail to null
        tail.next = null;
    }

    public static void swapNodes(Node head, int x, int y)
    {
        if(head == null)
        {
            return;
        }

        Node t1 = head;
        Node t2 = head;

        while(t1 != null && t2 != null)
        {
            if(t1.data != x)
            {
                t1 = t1.next;
            }

            if(t2.data != y)
            {
                t2 = t2.next;
            }

            if(t1.data == x && t2.data == y)
            {
                break;
            }
        }

        int temp = t1.data;
        t1.data = t2.data;
        t2.data = temp;
    }

    public static void print()
    {
        Node temp = head;

        System.out.print("Elements : ");
        while(temp != null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
    public static void main(String[] args)
    {
        // Q. Swapping Nodes in Linked List
        Ch20_Assignment_3 obj = new Ch20_Assignment_3();

        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);

        System.out.print("Before Swapping ");
        print();

        swapNodes(head, 2, 4);

        System.out.print("\nAfter  Swapping ");
        print();
    }
}