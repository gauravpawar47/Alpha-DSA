package Programs.Chapter_14;

public class Ch14_Assignment_2
{
    static String numbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printString(int n)
    {
        if(n == 0)
            return;

        int lastDigit = n % 10;
        printString(n / 10);
        System.out.print(numbers[lastDigit] +" ");
    }

    public static void main(String[] args)
    {
        // Q. You are given a number (eg - 2019) convert it into string of english like "two zero one nine". use a recursive function to solve this problem

        int n = 2020;

        printString(n);
    }
}