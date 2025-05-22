package Programs.Chapter_24;

public class Ch24_7_Count
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
    
    public static int count(Node root)
    {
        // Base-Case
        if(root == null)
        {
            return 0;
        }
        
        // Recursion
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        
        return leftCount + rightCount + 1;
    }
    
    public static void main(String[] args)
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println("Count : "+ count(root));
    }
}