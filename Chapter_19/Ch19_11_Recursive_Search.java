package Programs.Chapter_19;

public class Ch19_11_Recursive_Search
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

    public int helper(Node head, int key)
    {
        // Base Case
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }

        return idx + 1;
    }
    public int recursiveSearch(int key)
    {
        return helper(head, key);
    }

    public static void main(String[] args)
    {
        Ch19_11_Recursive_Search obj1 = new Ch19_11_Recursive_Search();

        obj1.addFirst(10);
        obj1.addFirst(20);
        obj1.addFirst(30);

        System.out.println("Key 20 Found at Index : "+ obj1.recursiveSearch(20));
        System.out.println("Key 50 Found at Index : "+ obj1.recursiveSearch(50));
    }
}