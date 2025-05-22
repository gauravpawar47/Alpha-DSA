package Programs.Chapter_28;

public class Ch28_5_AVL
{
    public static class Node
    {
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        return root.height;
    }

    public static int getBalance(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    public static Node leftRotate(Node x)
    {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static Node rightRotate(Node y)
    {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        x.height = Math.max(height(x.left), height(x.right));
        y.height = Math.max(height(y.left), height(y.right));

        return x;
    }

    public static Node insert(Node root, int data)
    {
        // Base-Case (First Node)
        if(root == null)
        {
            return new Node(data);
        }

        if(data < root.data) // Left Subtree Insertion
        {
            root.left = insert(root.left, data);
        }
        else if(data > root.data) // Right Subtree Insertion
        {
            root.right = insert(root.right, data);
        }
        else // Avoiding Duplication Of Nodes
        {
            return root;
        }

        // Incrementing the Height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Calculate Balance Factor
        int bf = getBalance(root);

        // Left Rotate
        if(bf > 1 && data < root.left.data)
        {
            return rightRotate(root);
        }

        // Right Rotate
        if(bf < -1 && data > root.right.data)
        {
            return leftRotate(root);
        }

        // Left Rotate Rotate
        if(bf > 1 && data > root.left.data)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Rotate
        if(bf < -1 && data < root.right.data)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

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
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 60);
        root = insert(root, 70);

        System.out.print("AVL Tree Node : ");
        preOrder(root);
    }
}