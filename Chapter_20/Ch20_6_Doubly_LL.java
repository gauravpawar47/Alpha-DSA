package Programs.Chapter_20;

public class Ch20_6_Doubly_LL
{
    public static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
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

        // Step 2 : Linking Head and NewNode
        newNode.next = head;
        head.prev = newNode;

        // Step 3 : Assigning head to newNode
        head = newNode;
    }

    public void removeFirst()
    {
        if(head == null)
        {
            System.out.print("Empty !!");
            return;
        }

        // Step 0 - Single Node
        if(size == 1)
        {
            head = tail = null;
            size--;
            return;
        }

        // Step 1 : Moving head to its next
        head = head.next;

        // Step 2 : Making previous to null
        head.prev = null;
        size--;
    }

    public void addLast(int data)
    {
        // Step 1 : Create a New Node
        Node newNode = new Node(data);
        size++;

        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        // Step 2 : Linking Head and NewNode
        newNode.prev = tail;
        tail.next = newNode;
        newNode.next = null;

        // Step 3 : Assigning head to newNode
        tail = newNode;
    }

    public void removeLast()
    {
        if(head == null)
        {
            System.out.println("Empty");
            return;
        }

        // Step 0 - Single Node
        if(size == 1)
        {
            head = tail = null;
        }

        // Step 1 : Moving head to its next
        tail = tail.prev;

        // Step 2 : Making previous to null
        tail.next = null;
        size--;
    }

    public void print()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Ch20_6_Doubly_LL obj = new Ch20_6_Doubly_LL();

        System.out.print("Add First    : ");
        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.addFirst(50);
        obj.print();

        System.out.print("Remove First : ");
        obj.removeFirst();
        obj.removeFirst();
        obj.print();

        System.out.print("Add Last     : ");
        obj.addLast(60);
        obj.addLast(70);
        obj.addLast(80);
        obj.addLast(90);
        obj.addLast(100);
        obj.print();

        System.out.print("Remove Last  : ");
        obj.removeLast();
        obj.removeLast();
        obj.print();
    }
}