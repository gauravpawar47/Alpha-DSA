package Programs.Chapter_12;

public class Ch12_Assignment_4
{
    public static void main(String []args)
    {
        // Q. Convert Uppercase characters to Lowercase using Bits

        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.print((char) (ch | ' ') +" ");
        }
    }
}