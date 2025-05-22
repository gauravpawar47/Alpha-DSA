package Programs.Chapter_26;

public class Ch26_4_Minimum_Distance
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
         if(left == null)
         {
             return right;
         }

        // Right == valid && Left = null
         if(right == null)
         {
             return left;
         }

        // n1 and n2 are in left and right of root
         return root;
    }

    public static int lcaDist(Node root, int n)
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

        // Calculating Distance in left and right direction
        int leftD = lcaDist(root.left, n);
        int rightD = lcaDist(root.right, n);

        // left & right == null return -1
        if(leftD == -1 && rightD == -1)
        {
            return -1;
        }

        // left == null return right + 1
        else if(leftD == -1)
        {
            return rightD + 1;
        }

        // right == null return left + 1
        else
        {
            return leftD + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2)
    {
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(root, n1);
        int dist2 = lcaDist(root, n2);

        return dist1 + dist2;
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println("Distance Between 4 and 6 : "+ minDist(root, 4, 6));
    }
}