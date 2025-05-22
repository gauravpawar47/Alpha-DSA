package Programs.Chapter_26;

public class Ch26_6_Transform_Sum_Tree
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

    public static int transform(Node root)
    {
        // Base-Case
        if(root == null)
        {
            return 0;
        }

        // Find in Left and Right Subtree (Recursion)
        int left = transform(root.left);
        int right = transform(root.right);

        // Calculate Sum of those left and right values
        int data = root.data;

        // Avoiding Null pointer in the base case
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = left + newLeft + right + newRight;

        return data;
    }

    public static void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        preOrder(root);
    }
}