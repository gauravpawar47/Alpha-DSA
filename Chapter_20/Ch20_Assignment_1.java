package Programs.Chapter_20;

public class Ch20_Assignment_1
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

    public static Node getInsected(Node head1, Node head2)
    {
        while(head2 != null)
        {
            Node temp = head1;
            while(temp != null)
            {
                if(head2 == temp)
                {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return  null;
    }

    public static void main(String[] args)
    {
        // Q. Intersection of Two Linked List

        Ch20_Assignment_1 obj = new Ch20_Assignment_1();

        Node head1 = new Node(1);
        Node head2 = new Node(4);

        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(6);
        Node a5 = new Node(7);

        Node b2 = new Node(5);

        head1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;

        head2.next = b2;
        b2.next = a4;

        System.out.println("Intersected Node : "+ getInsected(head1, head2).data);
    }
}