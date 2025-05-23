package Programs.Chapter_20;

public class Ch20_7_Reverse_DLL
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

    public void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
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
        Ch20_7_Reverse_DLL obj = new Ch20_7_Reverse_DLL();

        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.addFirst(50);

        System.out.print("Before Reverse : ");
        obj.print();

        obj.reverse();

        System.out.print("After Reverse  : ");
        obj.print();
    }
}