package Programs.Chapter_27;
import java.util.ArrayList;

public class Ch27_5_Print_Path
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

    public static void printPath(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null)
        {
            print(path);
        }

        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void print(ArrayList<Integer> path)
    {
        System.out.print("Elements : ");
        for(int i = 0; i < path.size(); i++)
        {
            System.out.print(path.get(i) +" ");
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        printPath(root, new ArrayList<>());
    }
}