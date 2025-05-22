package Programs.Chapter_19;

public class Ch19_12_Reverse
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

    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        Ch19_12_Reverse obj = new Ch19_12_Reverse();

        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.addFirst(50);
        obj.print(head);

        obj.reverse();
        obj.print(head);
    }
}