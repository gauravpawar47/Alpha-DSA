package Programs.Chapter_28;
import java.util.ArrayList;

public class Ch28_4_Merge_2_BST
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

    public static Node mergeBST(Node root1, Node root2)
    {
        // Step 1 : Get Inorder for root1 and root 2
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        getInOrder(root1, arr1);
        getInOrder(root2, arr2);

        // Step 2 : Merge and Sort the Array
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while(i < arr1.size() && j < arr2.size())
        {
            if(arr1.get(i) <= arr2.get(j))
            {
                result.add(arr1.get(i));
                i++;
            }
            else
            {
                result.add(arr2.get(j));
                j++;
            }
        }

        while(i < arr1.size())
        {
            result.add(arr1.get(i));
            i++;
        }

        while(j < arr2.size())
        {
            result.add(arr2.get(j));
            j++;
        }

        // Step 3 : Create Final Balanced BST
        return buildBalancedBST(result, 0, result.size() - 1);
    }

    public static Node buildBalancedBST(ArrayList<Integer> arr, int st, int end)
    {
        if(st > end)
        {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = buildBalancedBST(arr, st, mid - 1);
        root.right = buildBalancedBST(arr, mid + 1, end);

        return root;
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
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        System.out.print("BST 1 : ");
        preOrder(root1);

        System.out.print("\nBST 2 : ");
        preOrder(root2);

        Node root = mergeBST(root1, root2);
        System.out.print("\nMerged : ");
        preOrder(root);
    }
}