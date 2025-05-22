package Programs.Chapter_26;

public class Ch26_5_Kth_Ancestor
{
    public static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int k_Ancestor(Node root, int n, int k)
    {
        // Base-Case
        if(root == null)
        {
            return -1;
        }

        if(root.data == n)
        {
            return 0;
        }

        // Find in Left and Right Subtree (Recursion)
        int left = k_Ancestor(root.left, n, k);
        int right = k_Ancestor(root.right, n, k);

        // left & right == -1 return -1
        if(left == -1 && right == -1)
        {
            return -1;
        }

        int max = Math.max(left, right);
        if(max + 1 == k)
        {
            System.out.print(root.data);
        }

        return max + 1;
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.print("2nd Ancestor Of Node 4 : ");
        k_Ancestor(root, 4, 2);
    }
}