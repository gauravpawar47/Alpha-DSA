package Programs.Chapter_11;

public class Ch11_13_Question_String_Compression
{
    public static String compressed(String str)
    {
        StringBuilder result = new StringBuilder("");

        for(int i = 0; i < str.length(); i++)
        {
            int count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1))
            {
                count += 1;
                i += 1;
            }
            result.append(str.charAt(i));
            if(count > 1)
                result.append(Integer.toString(count));
        }

        return result.toString();
    }

    public static void main(String []args)
    {
        String str = "aaabbccccdd";

        String comp = compressed(str);
        System.out.println(comp);
    }
}