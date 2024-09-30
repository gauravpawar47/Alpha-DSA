public class _10_Largest_String
{
    public static String largest(String[] str)
    {
        String largest = str[0];

        for(int i = 1; i < str.length; i++)
        {
            if(largest.compareTo(str[i]) < 0)
            {
                largest = str[i];
            }
        }

        return largest;
    }

    public static void main(String[] args)
    {
        String[] string = {"apple", "mango", "banana"}; 

        System.out.println("Largest String : "+ largest(string));
    }
}