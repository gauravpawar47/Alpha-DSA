package Programs.Chapter_11;

public class Ch11_05_CharAt
{
    public static void main(String []args)
    {
        String str = "Gaurav Pawar";

        for(int i = 0; i < str.length(); i++)
        {
            System.out.println("Char at "+ i +" is : "+ str.charAt(i));
        }
    }
}