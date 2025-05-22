package Programs.Chapter_31;

public class Ch31_6_Longest_Word_Prefixes
{
    public static class Node
    {
        Node[] child = new Node[26];
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

    public static String ans = " ";

    public static void longestWord(Node root, StringBuilder temp)
    {
        // Base-Case
        if(root == null)
        {
            return;
        }

        // Recursion
        for(int i = 0; i < 26; i++)
        {
            if(root.child[i] != null && root.child[i].eow)
            {
                char ch = (char) (i + 'a');
                temp.append(ch);

                if(temp.length() > ans.length())
                {
                    ans = temp.toString();
                }
                longestWord(root.child[i], temp);

                // Backtrack
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args)
    {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i = 0; i < words.length; i++)
        {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(" "));
        System.out.println("Longest Word With All Prefixes : "+ ans);
    }
}