package Programs.Chapter_28;
import java.util.ArrayList;

public class Ch28_2_Convert_BST_Balanced
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

    public static Node balancedBST(Node root)
    {
        // Step 1 : Obtain Sorted InOrder Sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);

        // Step 2 : Build a BST
        return buildBalancedBST(inOrder, 0, inOrder.size() - 1);
    }

    public static void getInOrder(Node root, ArrayList<Integer> inOrder)
    {
        if(root == null)
        {
            return;
        }

        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        getInOrder(root.right, inOrder);
    }

    public static Node buildBalancedBST(ArrayList<Integer> inorder, int st, int end)
    {
        if(st > end)
        {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));

        root.left = buildBalancedBST(inorder, st, mid - 1);
        root.right = buildBalancedBST(inorder, mid + 1, end);

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

        for(int i = 0; i < arr.length; i++)
        {
            root = insert(root, arr[i]);
        }

        System.out.print("Before Converting to Balanced BST : ");
        preOrder(root);

        root = balancedBST(root);

        System.out.print("\nAfter  Converting to Balanced BST : ");
        preOrder(root);
    }
}