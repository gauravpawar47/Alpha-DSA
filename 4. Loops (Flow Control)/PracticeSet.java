public class PracticeSet
{
    public static void main(String[] args)
    {
        // Q 1. Output 

        // --> 2

        // Q 2. N Even and N Odd

        int n = 10;
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1; i <= 10; i++)
        {
            if(i % 2 == 0)
            {
                evenSum += i;
            }
            else
            {
                oddSum += i;
            }
        }    

        System.out.println("Even Sum : "+ evenSum);
        System.out.println("Odd  Sum : "+ oddSum);

        // Q 3. Factorial

        int factorial = 1;

        for(int i = 1; i <= 5; i++)
        {
            factorial *= i;
        }

        System.out.println("Factorial of 5 is : "+ factorial);

        // Q 4. Multiplication Table

        System.out.println("Table of 5");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(5 +" X "+ i +" : "+ (5 * i));
        }

        // Q 5. Error Finding 

        // --> i is accessed Outside the Loop
    }
}