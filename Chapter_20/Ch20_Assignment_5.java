package Programs.Chapter_20;

public class Ch20_Assignment_5
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

    private static Node merge(Node h1, Node h2)
    {
        Node dummy = new Node(0);
        Node p = dummy;

        while (h1 != null && h2 != null)
        {
            if (h1.data < h2.data)
            {
                p.next = h1;
                h1 = h1.next;
            }
            else
            {
                p.next = h2;
                h2 = h2.next;
            }
            p = p.next;
        }
        p.next = (h1 == null) ? h2 : h1;
        return dummy.next;
    }

    public static Node mergeKLists(Node[] lists)
    {
        if (lists == null || lists.length == 0)
        {
            return null; // handle edge case
        }

        for (int i = 1; i < lists.length; i++)
        {
            lists[0] = merge(lists[0], lists[i]);
        }

        return lists[0];
    }

    public static void print(Node head)
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

    public static void main(String []args)
    {
        int k = 3;
        int n = 4;
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeKLists(arr);
        print(head);
    }
}