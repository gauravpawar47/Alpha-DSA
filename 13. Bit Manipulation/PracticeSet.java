public class PracticeSet
{
    public static void main(String[] args)
    {
        // Q 1. x^x = x

        // --> 0

        // Q 2. Swap two Without Third

        int a = 3;
        int b = 4;

        System.out.println("Before : "+a +", "+ b);

        a ^= b;
        b ^= a;
        a ^= b;
        
        System.out.println("After  : "+a +", "+ b);

        // Q 3. Add 1 to Integer

        int x = 6;

        System.out.println(x +" + 1 : "+ -~x);
 
        // Q 4. LowerCase to UpperCase

        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.print((char)(ch | ' ') + " ");
        }

        // Q 5. Reading Material
    }
}