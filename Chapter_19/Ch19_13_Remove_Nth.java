package Programs.Chapter_19;

public class Ch19_13_Remove_Nth
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = next;
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

        if (head == null)
        {
            head = tail = newNode;
            return;
        }

        // Step 2 : Next of New Node points to Head
        newNode.next = head;

        // Step 3 : Assigning head to newNode
        head = newNode;
    }

    public void removeNth(int n)
    {
        int sz = 0;

        // Remove Head
        if(n == sz)
        {
            head = head.next;
        }

        // Remove other than Head
        sz = size - n;
        int i = 1;
        Node prev = head;

        while(i < sz)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
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
        Ch19_13_Remove_Nth obj = new Ch19_13_Remove_Nth();

        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.addFirst(50);
        obj.print(head);

        obj.removeNth(3);
        obj.print(head);
    }
}