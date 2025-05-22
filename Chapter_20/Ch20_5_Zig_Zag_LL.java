package Programs.Chapter_20;

public class Ch20_5_Zig_Zag_LL
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

    private Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static Node reverse(Node midNode)
    {
        Node curr = midNode.next;
        midNode.next = null;
        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public void zigZag()
    {
        // Step 1 : Find Middle
        Node midNode = findMid(head);

        // Step 2 : Reverse 2nd Half
        Node prev = reverse(midNode);

        // Step 3 : Alternate Merging
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left != null && right != null)
        {
            // Zig - Zag Linking
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // Update
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args)
    {
        Ch20_5_Zig_Zag_LL obj = new Ch20_5_Zig_Zag_LL();

        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.addFirst(50);
        obj.addFirst(60);
        obj.addFirst(70);

        System.out.print("Before Zig-Zag : ");
        obj.print();

        obj.zigZag();

        System.out.print("After Zig-Zag  : ");
        obj.print();
    }
}