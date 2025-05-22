package Programs.Chapter_19;

public class Ch19_3_Add_First
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

    public void addFirst(int data)
    {
        // Step 1 : Create a New Node
        Node newNode = new Node(data);

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

    public static void main(String []args)
    {
        Ch19_3_Add_First obj1 = new Ch19_3_Add_First();

        obj1.addFirst(10);
        obj1.addFirst(20);
        obj1.addFirst(30);
        obj1.addFirst(40);
        obj1.addFirst(50);
    }
}