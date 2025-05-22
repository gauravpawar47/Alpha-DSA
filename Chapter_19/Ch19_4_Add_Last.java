package Programs.Chapter_19;

public class Ch19_4_Add_Last
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

    public static void main(String []args)
    {
        Ch19_4_Add_Last obj1 = new Ch19_4_Add_Last();

        obj1.addLast(10);
        obj1.addLast(20);
        obj1.addLast(30);
        obj1.addLast(40);
        obj1.addLast(50);
    }
}