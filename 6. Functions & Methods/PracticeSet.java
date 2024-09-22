public class PracticeSet
{
    public static void avg(int a, int b, int c)
    {
        System.out.println("Average "+ (a + b + c) / 2);
    }

    public static void evenOdd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }

    public static boolean isPalindrome(int n)
    {
        int temp = n;
        int palindrome = 0;
        while(temp > 0)
        {
            int lastDigit = temp % 10;
            palindrome = (palindrome + lastDigit) * 10;
            temp /= 10;
        }
        palindrome /= 10;
        return palindrome == n;
    }


    public static int sumDigits(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        
        return sum;
    }

    public static void main(String[] args)
    {
        // Q 1. Avg of Three Numbers

        avg(5, 6,7);

        // Q 2. Even Odd

        evenOdd(5);

        // Q 3. Is Palindrome 

        System.out.println("121 is Palindrome : "+ isPalindrome(121));
 
        // Q 4. Reading Material

        // Q 5. Sum of Digit

        System.out.println("Sum of 12345 : "+ sumDigits(1234) );
    }
}