package Programs.Chapter_27;

public class Ch27_2_Search
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

    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }

        if(key == root.data)
        {
            return true;
        }

        if(key < root.data)
        {
            return search(root.left, key);
        }

        else
        {
            return search(root.right, key);
        }
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
        int n = 11;
        int[] values = {5, 4, 2, 6, 1, 7, 8, 9, 3, 10};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        System.out.print("Inorder : ");
        inOrder(root);

        if(search(root, n))
        {
            System.out.println("\n"+ n +" Exist in Tree");
        }

        else
        {
            System.out.println("\n"+ n +" Doesn't Exist in Tree");
        }
    }
}