package Programs.Chapter_12;

public class Ch12_00_Revision
{
    public static void main(String[] args)
    {
        // 4 - Binary AND &

//        System.out.println(7 & 15);

        // 5 - Binary OR |

//        System.out.println(7 | 15);

         // 6 - Binary XOR ^

//        System.out.println(7 ^ 15);

        // 7 - Binary One's Complement ~

//        System.out.println(~5);

        // 8 - Binary Left Shift  <<

//        System.out.println(6 << 3);

        // 9 - Binary Right Shift >>

//        System.out.println(8 >> 2);

        // 10 - Check if Number if Even or Odd (Question - 1)

//        int n = 10;
//        int bitMast = 1;
//
//        if((n & bitMast) == 0)
//            System.out.println("Even Number");
//        else
//            System.out.println("Odd Number");

        // 11 - Get ith Bit

//        int n = 10;
//        int i = 1;
//        int bitMask = 1 << i;
//
//        if((n & bitMask) == 0)
//            System.out.println(0);
//        else
//            System.out.println(1);

        // 12 -  Set ith Bit

//        int n = 9;
//        int i = 2;
//        int bitMast = 1 << i;
//
//        System.out.println(n | bitMast);

        // 13 - Clear ith Bit

//        int n = 7;
//        int i = 1;
//        int bitMask = ~(1 << i);
//
//        System.out.println(n & bitMask);

        // 14 - Update ith Bit

//        int n = 10;
//        int i = 2;
//        int bitMask = ~(1 << i);
//
//        n = n & bitMask;
//        int newBit = 1;
//        int newBitMask = newBit << i;
//
//        System.out.println(n | newBitMask);

        // 15 - Clear last i Bits

//        int n = 15;
//        int i = 3;
//        int bitMask = ~(0) << i;
//
//        System.out.println(n & bitMask);

        // 16 - Clear Range of Bits

//        int n = 15;
//        int i = 0;
//        int j = 3;
//
//        int bitMask = ~(1 << i);
//        n = n & bitMask;
//
//        bitMask = ~(1 << j);
//        n = n & bitMask;
//
//        System.out.println(n);

        // 17 - Is Power of 2 (Question - 2)

//        int n = 15;
//        boolean result = ((n & (n - 1)) == 0) ? true : false;
//
//        System.out.println(result);

        // 18 - Count Set Bits in Number (Question - 3)

//        int n = 10;
//        int count = 0;
//
//        while(n > 0)
//        {
//            if((n & 1) != 0)
//                count += 1;
//
//            n = n >> 1;
//        }
//
//        System.out.println(count);

        // 19 - Fast Exponentiation

//        int num = 5;
//        int n = 3;
//        int result = 1;
//
//        while(n > 0)
//        {
//            if((n & 1) != 0)
//                result *= num;
//
//            num *= num;
//            n = n >> 1;
//        }
//
//        System.out.println(result);

        // Assignment Q1 - What is the value of x^x for any value of x

        // --> If we think about it, by using XOR operation it will always give 0 for same bits so x^x for x is 0

        // Assignment Q2 - Swap two Numbers without using any 3rd Variable

//        int a = 5;
//        int b = 2;
//
//        System.out.println("Value of a : "+ a);
//        System.out.println("Value of a : "+ b);
//
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//
//        System.out.println("\nValue of a : "+ a);
//        System.out.println("Value of a : "+ b);

        // Assignment Q3 - Add 1 to an Integer using Bit Manipulation

//        int a = 7;
//        int b = ~a;
//        int c = -b;
//
//        System.out.println(a +" "+ b +" "+ c);

        // Assignment Q4 - Convert Uppercase Characters to Lowercase Characters using Bits

//        for(char ch = 'A'; ch <= 'Z'; ch++)
//        {
//            System.out.print((char) (ch  | ' ') +" ");
//        }

        // Assignment Q5 - Reading Material

        // --> Done
    }
}