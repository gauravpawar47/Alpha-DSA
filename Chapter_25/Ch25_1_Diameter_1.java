package Programs.Chapter_25;

public class Ch25_1_Diameter_1
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

    public static int height(Node root)
    {
        // Base-Case
        if(root == null)
        {
            return 0;
        }

        // Recursion
        int leftHalf = height(root.left);
        int rightHalf = height(root.right);

        return Math.max(leftHalf, rightHalf) + 1;
    }

    public static int diameter(Node root)
    {
        // Base-Case
        if(root == null)
        {
            return 0;
        }

        // Recursion
        int leftD = diameter(root.left);
        int rightD = diameter(root.right);
        int leftH = height(root.left);
        int rightH = height(root.right);

        int selfHeight = leftH + rightH + 1;
        return Math.max(Math.max(leftD, rightD), selfHeight);
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println("Diameter : "+ diameter(root));
    }
}