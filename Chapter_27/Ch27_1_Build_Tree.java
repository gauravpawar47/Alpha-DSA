package Programs.Chapter_27;

public class Ch27_1_Build_Tree
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

    public static Node insert(Node root, int val)
    {
        // Base-Case
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        if(val < root.data)
        {
            root.left = insert(root.left, val);
        }
        else
        {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static void main(String[] args)
    {
        int[] values = {5, 4, 2, 6, 1, 7, 8, 9, 3, 10};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        System.out.print("Inorder : ");
        inOrder(root);
    }
}