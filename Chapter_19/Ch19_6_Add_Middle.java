package Programs.Chapter_19;

public class Ch19_6_Add_Middle
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

    public void addMiddle(int target, int data)
    {
        if(target == 0)
        {
            addFirst(data);
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < target - 1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args)
    {
        Ch19_6_Add_Middle obj1 = new Ch19_6_Add_Middle();

        obj1.addFirst(10);
        obj1.addFirst(20);
        obj1.addFirst(30);
        obj1.print(head);

        obj1.addMiddle(1, 100);
        obj1.print(head);
    }
}