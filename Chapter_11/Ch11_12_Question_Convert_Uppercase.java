package Programs.Chapter_11;

public class Ch11_12_Question_Convert_Uppercase
{
    public static String toUpperCase(String str)
    {
        StringBuilder result = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        result.append(ch);

        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i < str.length() - 1)
            {
                result.append(str.charAt(i));
                i++;
                result.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String []args)
    {
        String str = "hi, iam gaurav pawar";

        System.out.println(toUpperCase(str));
    }
}