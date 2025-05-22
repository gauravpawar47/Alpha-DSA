package Programs.Chapter_28;

public class Ch28_1_Build_Balanced_BST
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

    public static Node buildBalancedBST(int[] arr, int st, int end)
    {
        if(st > end)
        {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = buildBalancedBST(arr, st, mid - 1);
        root.right = buildBalancedBST(arr, mid + 1, end);

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
        int[] arr = {3, 6, 5, 8, 10, 11, 12};
        Node root = null;

        for (int i : arr)
        {
            root = insert(root, i);
        }

        System.out.print("Before Balancing Tree : ");
        preOrder(root);

        root = buildBalancedBST(arr, 0, arr.length - 1);

        System.out.print("\nAfter  Balancing Tree : ");
        preOrder(root);
    }
}