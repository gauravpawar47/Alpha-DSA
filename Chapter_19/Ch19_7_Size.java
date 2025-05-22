package Programs.Chapter_19;

public class Ch19_7_Size
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

    public static void main(String[] args)
    {
        Ch19_7_Size obj1 = new Ch19_7_Size();

        obj1.addFirst(10);
        obj1.addFirst(20);
        obj1.addFirst(30);

        System.out.println("Size : "+ size);
    }
}