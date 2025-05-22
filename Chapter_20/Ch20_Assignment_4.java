package Programs.Chapter_20;

public class Ch20_Assignment_4
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

    public static void segregateEvenOdd()
    {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null)
        {
            end = end.next;
        }

        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end)
        {
            new_end.next = curr;
            curr = curr.next;

            new_end.next.next = null;
            new_end = new_end.next;
        }

        if (curr.data % 2 == 0)
        {
            head = curr;
            while (curr != end)
            {
                if (curr.data % 2 == 0)
                {
                    prev = curr;
                    curr = curr.next;
                }
                else
                {
                    prev.next = curr.next;
                    curr.next = null;

                    new_end.next = curr;
                    new_end = curr;

                    curr = prev.next;
                }
            }
        }
        else
        {
            prev = curr;
        }

        if (new_end != end && end.data % 2 != 0)
        {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
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
        // Q. Odd Even Linked List
        Ch20_Assignment_4 obj = new Ch20_Assignment_4();

        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);

        System.out.print("Before Segregating ");
        print();

        segregateEvenOdd();

        System.out.print("\nAfter  Segregating ");
        print();
    }
}