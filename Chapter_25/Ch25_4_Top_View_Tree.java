package Programs.Chapter_25;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Ch25_4_Top_View_Tree
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

    public static class Info
    {
        Node node;
        int hd;

        public Info(Node node, int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root)
    {
        // Level Order Traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>(); // Frequency of Occurring the same HD node
        int min = 0;
        int max = 0;

        // Insert Initial Root Node
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty())
        {
            Info curr = q.remove();
            if(curr == null)
            {
                if(q.isEmpty())
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
                // First Time Node Occurring (Top View Node)
                if(!map.containsKey(curr.hd))
                {
                    map.put(curr.hd, curr.node);
                }

                // Left Node
                if(curr.node.left != null)
                {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                // Right Node
                if(curr.node.right != null)
                {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        // Printing Top View
        for(int i = min; i <= max; i++)
        {
            System.out.print(map.get(i).data +" ");
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        System.out.print("Top View : ");
        topView(root);
    }
}