package Programs.Chapter_6;
import java.util.Scanner;

public class Ch6_Assignment_3
{
    public static boolean isPalindrome(int num)
    {
        int temp = num;
        int palindrome = 0;

        while(temp > 0)
        {
            int lastDigit = temp % 10;
            temp /= 10;
            palindrome = (palindrome * 10) + lastDigit;
        }

        return num == palindrome;
    }

    public static void main(String[] args)
    {
        // Q. Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        if(isPalindrome(num))
            System.out.println("The Entered Number is Palindrome Number");
        else
            System.out.println("The Entered Number is not Palindrome Number");
    }
}