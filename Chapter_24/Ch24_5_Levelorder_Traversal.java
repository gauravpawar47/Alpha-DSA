package Programs.Chapter_24;
import java.util.Queue;
import java.util.LinkedList;

public class Ch24_5_Levelorder_Traversal
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
        public static int idx = -1;
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

        public static void levelOrder(Node root)
        {
            // Base-Case
            if(root == null)
            {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node curr = q.remove();

                if(curr == null)
                {
                    System.out.println();
                    if (q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(curr.data +" ");

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
    }

    public static void main(String[] args)
    {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree obj = new BinaryTree();

        Node root = obj.buildTree(nodes);
        obj.levelOrder(root);
    }
}