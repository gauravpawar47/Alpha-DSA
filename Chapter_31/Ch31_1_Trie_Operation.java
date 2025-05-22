package Programs.Chapter_31;

public class Ch31_1_Trie_Operation
{
    public static class Node
    {
        Node[] child = new Node[26];
        boolean eow = false;

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

    public static void main(String[] args)
    {
        String[] word = {"the", "a", "there", "their", "any", "thee"};
        for(int i = 0; i < word.length; i++)
        {
            insert(word[i]);
        }

        System.out.println("Thee in Trie : "+ search("thee"));
        System.out.println("Thor in Trie : "+ search("thor"));
    }
}