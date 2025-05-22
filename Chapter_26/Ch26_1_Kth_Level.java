package Programs.Chapter_26;
import java.util.LinkedList;
import java.util.Queue;

public class Ch26_1_Kth_Level
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

    public static void kLevel_Recursive(Node root, int level, int k)
    {
        // Base-Case
        if(root == null)
        {
            return;
        }

        // Level Found
        if(level == k)
        {
            System.out.print(root.data +" ");
            return;
        }

        // Recursion
        kLevel_Recursive(root.left, level + 1, k);
        kLevel_Recursive(root.right, level + 1, k);
    }

    public static void kLevel_Iterative(Node root, int level, int k)
    {
        // Base-Case
        if(root == null)
        {
            return;
        }

        // Main Operation
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    level++;
                    q.add(null);
                }
            }
            else
            {
                if(level == k)
                {
                    System.out.print(curr.data +" ");
                }
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Using Recursive Method Nodes at level 3 : ");
        kLevel_Iterative(root, 1, 3);

        System.out.print("Using Iterative Method Nodes at level 3 : ");
        kLevel_Iterative(root, 1, 3);
    }
}