package Programs.Chapter_31;

public class Ch31_2_Word_Break_Problem
{
    public static class Node
    {
        Node[] child = new Node[26];
        boolean eow;

        public Node()
        {
            for(int i = 0; i < child.length; i++)
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

    public static boolean wordBreak(String word)
    {
        // Base-Case
        if(word.length() == 0)
        {
            return true;
        }

        for(int i = 1; i <= word.length(); i++)
        {
            if(search(word.substring(0, i)) && wordBreak(word.substring(i)))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        String[] word = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung";

        for(int i = 0; i < word.length; i++)
        {
            insert(word[i]);
        }

        System.out.println("Key Exist : "+ wordBreak(key));
    }
}