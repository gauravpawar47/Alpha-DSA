package Programs.Chapter_20;

public class Ch20_8_Circular_LL
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
        Node newNode = new Node(data);
        size++;

        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void removeFirst()
    {
        if(head == null)
        {
            System.out.println("Empty !!");
            return;
        }

        head = head.next;
        tail.next = head;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;

        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    public void removeLast()
    {
        if(head == null)
        {
            System.out.println("Empty !!");
            return;
        }

        Node prev = head;
        prev = prev.next;

        while(prev != null)
        {
            if(prev.next.next == head)
            {
                break;
            }
            prev = prev.next;
        }
        tail = prev;
        tail.next = head;
    }

    public void print()
    {
        Node temp = head;

        System.out.print(temp.data +" -> ");
        temp = temp.next;

        while(temp != head)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Ch20_8_Circular_LL obj = new Ch20_8_Circular_LL();

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