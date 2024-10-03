public class _13_Letters_To_Uppercase
{
    public static String upperCase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i < str.length() - 1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {
        String str = "hi, i'm gaurav !";

        System.out.println("Before Uppercase : "+ str);
        System.out.println("After  Uppercase : "+ upperCase(str));
    }
}