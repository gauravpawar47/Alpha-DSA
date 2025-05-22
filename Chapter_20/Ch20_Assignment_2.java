package Programs.Chapter_20;

public class Ch20_Assignment_2
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

    public void addLast(int data)
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

    public static void deleteNode(Node head, int M, int N)
    {
        if(head == null)
        {
            return;
        }

        Node curr = head;
        int mCount = 1;
        int nCount = 0;

        while(mCount < M && curr != null)
        {
            curr = curr.next;
            mCount++;
        }

        Node temp = curr;
        while(nCount < N && temp != null)
        {
            temp = temp.next;
            nCount++;
        }

        if((temp != null ? temp.next : null) == null || curr.next == null)
        {
            return;
        }
        curr.next = temp.next;
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
        // Q. Delete N Nodes After M Nodes of a Linked List

        Ch20_Assignment_2 obj = new Ch20_Assignment_2();

        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        obj.addLast(6);
        obj.addLast(7);
        obj.addLast(8);
        obj.addLast(9);
        obj.addLast(10);

        System.out.print("Before Removing ");
        print();
        deleteNode(head, 3, 2);
        System.out.print("\nAfter  Removing ");
        print();
    }
}