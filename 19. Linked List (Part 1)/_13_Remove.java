public class _13_Remove
{
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;
    public static Node head;
    public static Node tail;

    public void addLast(int data)
    {
        // Step 1 : Create New Node
        Node newNode = new Node(data);
        size++;

        // Corner Case - Check If Linked List is Empty
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            // Step 2 : Link New Node to Tail
            tail.next = newNode;

            // Step 3 : Making New Node as Tail
            tail = newNode;
        }
    }

    public int remove(int n)
    {
        // Corner Case 1: Check if Linked List is Empty
        if (size == 0)
        {
            return Integer.MIN_VALUE;
        }

        // Corner Case 2: If Head and Tail are Same
        if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Corner Case 3: If n == size (remove the head)
        if (n == size)
        {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        // Find the (size - n)th node (node before the target)
        int target = size - n; 
        Node curr = head;
        Node prev = null;

        for (int i = 0; i < target; i++)
        {
            prev = curr;
            curr = curr.next;
        }

        // Remove the target node
        int val = curr.data;
        prev.next = curr.next;

        // If we are removing the tail, update the tail pointer
        if (curr == tail) 
        {
            tail = prev;
        }

        size--;
        return val;
    }


    public void print(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
        _13_Remove list = new _13_Remove();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.print(head);
        System.out.println("Size : "+ size +"\n");

        list.remove(3);
        list.print(head);
        System.out.println("Size : "+ size);
    }
}