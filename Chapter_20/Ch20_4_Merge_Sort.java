package Programs.Chapter_20;

public class Ch20_4_Merge_Sort
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

    public void print(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Middle Node
    }

    private Node merge(Node leftHead, Node rightHead)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(leftHead != null && rightHead != null)
        {
            if(leftHead.data < rightHead.data)
            {
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp =  temp.next;
            }
            else
            {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }

        // Remaining Left-half Elements
        while(leftHead != null)
        {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }

        // Remaining Right-half Elements
        while(rightHead != null)
        {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head)
    {
        // Step 0 : 1 | 0 Node Linked List
        if(head == null || head.next == null)
        {
            return head;
        }

        // Step 1 : Find Middle of Linked List
        Node mid = getMid(head);

        // Step 2 : Left and Right MS
        Node rightHead = mid.next;
        mid.next = null;

        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(rightHead);

        // Step 3 : Merge (Left Half | Right Half)
        return merge(leftHalf, rightHalf);
    }

    public static void main(String[] args)
    {
        Ch20_4_Merge_Sort obj = new Ch20_4_Merge_Sort();

        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.addFirst(50);

        System.out.print("Before Sorting : ");
        obj.print(head);

        obj.head = obj.mergeSort(obj.head);

        System.out.print("After Sorting  : ");
        obj.print(head);
    }
}