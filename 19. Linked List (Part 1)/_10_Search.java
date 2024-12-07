public class _10_Search
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

    public int iterativeSearch(int data)
    {
        Node temp = head;
        int i = 0;

        while(temp != null)
        {
            if(temp.data == data)
            {
                return i;
            }

            i++;
            temp = temp.next;
        }

        return -1;
    }

    public int recursiveSearch(int data)
    {
        Node temp = head;
        int i = 0;

        return search(data, i, temp);
    }

    public int search(int data, int i, Node temp)
    {
        // Step 1 : Base-Case
        if(temp == null)
        {
            return -1;
        }

        // Step 2 : Kaam
        if(temp.data == data)
        {
            return i;
        }

        // Step 3 : Inner Function Call
        temp = temp.next;
        return search(data, i + 1, temp);
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
        
        _10_Search list = new _10_Search();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.print(head);
        System.out.println("\nSize of Linked List : "+ size);

        System.out.println(30 +" Found at Index : "+ list.iterativeSearch(30));
        System.out.println(30 +" Found at Index : "+ list.recursiveSearch(50));
    }
}