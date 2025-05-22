package Programs.Chapter_24;

public class Ch24_8_Sum
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

    public static int sum(Node root)
    {
        // Base-Case
        if(root == null)
        {
            return 0;
        }

        // Recursion
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println("Sum : "+ sum(root));
    }
}