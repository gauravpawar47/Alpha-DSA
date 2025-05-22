package Programs.Chapter_11;

public class Ch11_11_String_Builder
{
    public static void main(String []args)
    {
        StringBuilder str = new StringBuilder("");
        for(char ch = 'a'; ch < 'z'; ch++)
        {
            str.append(ch);
        }

        System.out.println("String : "+ str +"\nLength : "+ str.length() );
    }
}