package Programs.Chapter_19;

public class Ch19_10_Iterative_Search
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

    public int iterativeSearch(int key)
    {
        int idx = 0;
        Node temp = head;

        while (temp != null)
        {
            if(temp.data == key)
            {
                return idx;
            }

            idx++;
            temp = temp.next;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        Ch19_10_Iterative_Search obj1 = new Ch19_10_Iterative_Search();

        obj1.addFirst(10);
        obj1.addFirst(20);
        obj1.addFirst(30);

        System.out.println("Key 20 Found at Index : "+ obj1.iterativeSearch(20));
        System.out.println("Key 50 Found at Index : "+ obj1.iterativeSearch(50));
    }
}