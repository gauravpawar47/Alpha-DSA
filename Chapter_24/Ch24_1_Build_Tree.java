package Programs.Chapter_24;

public class Ch24_1_Build_Tree
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
        static int idx = -1;

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
    }

    public static void main(String[] args)
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree obj = new BinaryTree();

        Node root = obj.buildTree(nodes);
        System.out.println("Root : "+ root.data);
    }
}