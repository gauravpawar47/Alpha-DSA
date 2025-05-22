package Programs.Chapter_31;

public class Ch31_4_Starts_With_Problem
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

    public static boolean startsWith(String word)
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
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for (int i = 0; i < words.length; i++)
        {
            insert(words[i]);
        }
    
        System.out.println(prefix1 +" Is Present in Words : "+ startsWith(prefix1));
        System.out.println(prefix2 +" Is Present in Words : "+ startsWith(prefix2));
    }
}   