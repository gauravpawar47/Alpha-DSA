package Programs.Chapter_31;

public class Ch31_5_Unique_Substrings
{
    public static class Node
    {
        Node child[] = new Node[26];
        boolean eow;

        public Node()
        {
            for(int i = 0; i < 26; i++)
            {
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word)
    {
        Node curr = root;
        for(int i = 0; i < word.length(); i++)
        {
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null)
            {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word)
    {
        Node curr = root;
        for(int i = 0; i < word.length(); i++)
        {
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null)
            {
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow;
    }

    public static int countNodes(Node root)
    {
        // Base-Case
        if(root == null)
        {
            return 0;
        }

        // Recursion
        int count = 0;
        for(int i = 0; i < 26; i++)
        {
            if(root.child[i] != null)
            {
                count += countNodes(root.child[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args)
    {
        String str = "apple";

        // Step 1 : Get all the suffix
        for(int i = 0; i < str.length(); i++)
        {
            String suffix = str.substring(i);
            // Step 2 : Create a Trie of all the suffix
            insert(suffix);
        }

        // Step 3 : Print the nodes of Trie
        System.out.println("Count Nodes of Trie : "+ countNodes(root));
    }
}