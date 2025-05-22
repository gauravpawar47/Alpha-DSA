package Programs.Chapter_27;

public class Ch27_4_Print_In_Range
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

    public static void printInRange(Node root, int k1, int k2)
    {
        if(root == null)
        {
            return;
        }

        if(k1 <= root.data && k2 >= root.data)
        {
            printInRange(root.left, k1, k2);
            System.out.print(root.data +" ");
            printInRange(root.right, k1, k2);
        }
        else if(k1 <= root.data)
        {
            printInRange(root.left, k1, k2);
        }
        else
        {
            printInRange(root.right, k1, k2);
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
        int[] values = {5, 4, 2, 6, 1, 7, 8, 9, 3, 10, 11, 12, 13, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        System.out.print("Elements : ");
        inOrder(root);

        System.out.print("\n5 to 12 : ");
        printInRange(root, 5, 11);
    }
}