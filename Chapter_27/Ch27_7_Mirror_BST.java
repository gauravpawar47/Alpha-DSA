package Programs.Chapter_27;

public class Ch27_7_Mirror_BST
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

    public static Node insert(Node root, int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }

        if(data < root.data)
        {
            root.left = insert(root.left, data);
        }
        else
        {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static Node mirrorBST(Node root)
    {
        if(root == null)
        {
            return null;
        }

        Node left = mirrorBST(root.left);
        Node right = mirrorBST(root.right);

        root.left = right;
        root.right = left;

        return root;
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
        int[] values = {8, 5, 10, 3, 6, 11};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        System.out.print("Before Mirroring : ");
        preOrder(root);

        mirrorBST(root);

        System.out.print("\nAfter  Mirroring : ");
        preOrder(root);
    }
}