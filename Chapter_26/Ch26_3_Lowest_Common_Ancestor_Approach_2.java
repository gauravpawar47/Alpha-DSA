package Programs.Chapter_26;

public class Ch26_3_Lowest_Common_Ancestor_Approach_2
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

    public static Node lca(Node root, int n1, int n2)
    {
        // Base-Case
        if(root == null)
        {
            return null;
        }

        if(root.data == n1 || root.data == n2)
        {
            return root;
        }

        // Find in Left and Right Subtree (Recursion)
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        // Left == valid && Right == null
        if(right == null)
        {
            return left;
        }

        // Right == valid && Left = null
        if(left == null)
        {
            return right;
        }

        // n1 and n2 are in left and right of root
        return root;
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println("Lowest Common Ancestor : "+ lca(root, 4, 5).data);
    }
}