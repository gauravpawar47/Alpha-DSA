package Programs.Chapter_20;

public class Ch20_1_Detect_Cycle
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

    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow)
            {
                return true; // Cycle Exist
            }
        }

        return false; // Cycle Doesn't Exist
    }

    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Is Cycle : "+ isCycle());
    }
}