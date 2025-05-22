package Programs.Chapter_20;

public class Ch20_2_Remove_Cycle
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

    public static void removeCycle()
    {
        // Step 1 : Detect Cycle +(1, 2)
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow)
            {
                isCycle = true;
                break;
            }
        }

        if(!isCycle)
        {
            return;
        }

        // Step 2 : Find Meeting Point
        slow = head;
        Node prev = null;

        while(fast != slow)
        {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // Step 3 : Remove Cycle
        prev.next = null;
    }

    public static void main(String[] args)
    {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head.next.next;

        System.out.println("Is Cycle : "+ isCycle());
        removeCycle();
        System.out.println("Is Cycle : "+ isCycle());
    }
}