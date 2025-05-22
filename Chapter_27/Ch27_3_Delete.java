package Programs.Chapter_27;

public class Ch27_3_Delete
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

    public static Node delete(Node root, int data)
    {
        if(data < root.data)
        {
            root.left = delete(root.left, data);
        }
        else if(data > root.data)
        {
            root.right = delete(root.right, data);
        }
        else // voila
        {
            // Case 1 : No Children
            if(root.left == null && root.right == null)
            {
                return null;
            }

            // Case 2 : One Children
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            // Case 3 : Two Children
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
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

        System.out.print("Before Deleting 3 : ");
        inOrder(root);

        root = delete(root, 3);
        System.out.print("\nAfter  Deleting 3 : ");
        inOrder(root);
    }
}