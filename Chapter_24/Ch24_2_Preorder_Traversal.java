package Programs.Chapter_24;

public class Ch24_2_Preorder_Traversal
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

    public static class BinaryTree
    {
        public static int idx = -1;
        public static Node buildTree(int[] nodes)
        {
            // Base-Case
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }

            // Recursion
            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);

            return root;
        }

        public static void preOrder(Node root)
        {
            // Base-Case
            if(root == null)
            {
                return;
            }

            // Recursion
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args)
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree obj = new BinaryTree();

        Node root = obj.buildTree(nodes);
        obj.preOrder(root);
    }
}