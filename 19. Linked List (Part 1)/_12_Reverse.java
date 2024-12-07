public class _12_Reverse
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
        System.out.println("NULL");
    }


    public static void main(String[] args)
    {
        _12_Reverse list = new _12_Reverse();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.print(head);
        list.reverse();
        list.print(head);

        System.out.println("Size of Linked List : "+ size);
    }
}