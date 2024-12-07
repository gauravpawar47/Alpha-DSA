public class _15_Palindromic
{
    class Node
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
        // Step 1 : Create a New Node
        Node newNode = new Node(data);

        // Step 2 : Check Whether Linked List Is Empty
        if(head == null)
        {
            head = tail = newNode;
            size++;
        }
        else
        {
            // Step 3 : Assign New Tail Next to new Node
            tail.next = newNode;

            // Step 4 : Make tail as newNode
            tail = newNode;
            size++;
        }
    }

    public boolean isPalindrome(Node head)
    {
        // Corner Case : Check if Linked List Empty or has 1 Node
        if(head.next == null || head == null)
        {
            return true;
        }

        // Step 1 : Find Mid
        Node mid = findMid(head);

        // Step 2 : Reverse Right Half
        Node curr = mid;
        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3 : Check Left == Right
        Node right = prev;
        Node left= head;

        while(right != null)
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

    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.print(" NULL \n");
    } 

    public static void main(String[] args)
    {
        _15_Palindromic list = new _15_Palindromic();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);

        list.print(head);
        System.out.println("Size : "+ size);
        System.out.println("Palindromic Linked List : "+ list.isPalindrome(head));
    }
}