package Programs.Chapter_21;

public class Ch21_Assignment_1
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

        if (head == null)
        {
            head = tail = newNode;
            return;
        }

        // Step 2 : Next of New Node points to Head
        newNode.next = head;

        // Step 3 : Assigning head to newNode
        head = newNode;
    }

    public static Node midNode(Node head) // Step 1 : Find Mid of Linked List
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow;
    }

    public static boolean isPalindrome(Node head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        // Step 1 : Find Mid
        Node midNode = midNode(head);

        // Step 2 : Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        // Step 3 : Check Left Half & Right Half
        while(left != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args)
    {
        // Q. Palindromic Linked List
        Ch21_Assignment_1 obj = new Ch21_Assignment_1();

        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(20);
        obj.addFirst(10);

        System.out.println("Linked List Palindrome : "+ obj.isPalindrome(head));
    }
}