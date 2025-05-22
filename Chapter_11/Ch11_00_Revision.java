package Programs.Chapter_11;
import java.util.Arrays;
import java.util.Scanner;

public class Ch11_00_Revision
{
    public static void _6_Palindrome(String str)
    {
        System.out.println("String is : "+ str);
        for(int i = 0; i < str.length() / 2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
            {
                System.out.println("Entered String is Not Palindrome !");
                return;
            }
        }
        System.out.println("Entered String is Palindrome !");
    }

    public static void _7_Shortest_Path(String path)
    {
        float x = 0f;
        float y = 0f;

        for(int i = 0; i < path.length(); i++)
        {
            if(path.charAt(i) == 'E')
                x++;
            else if(path.charAt(i) == 'W')
                x--;
            else if(path.charAt(i) == 'S')
                y--;
            else
                y++;
        }

        System.out.println("Shortest Path : "+ Math.sqrt((x * x) + (y * y)));
    }

    public static void _13_ConvertUpperCase(String str)
    {
        StringBuilder result = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        result.append(ch);

        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i < str.length() - 1)
            {
                result.append(str.charAt(i));
                i++;
                result.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                result.append(str.charAt(i));
        }

        System.out.println("Before Uppercase : "+ str);
        System.out.println("After  Uppercase : "+ result);
    }

    public static void _14_StringCompression(String str)
    {
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < str.length(); i++)
        {
            int count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1))
            {
                count += 1;
                i += 1;
            }
            result.append(str.charAt(i));

            if(count > 1)
                result.append(count);
        }

        System.out.println("Original String : "+ str);
        System.out.println("Compressed String : "+ result);
    }

    public static void Q1_NoOfVowels(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }

        System.out.println("String : "+ str);
        System.out.println("No Of Vowels : "+ count);
    }

    public static void Q4_Anagrams(String str1, String str2)
    {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if(s1.length() == s2.length())
        {
            char r1[] = s1.toCharArray();
            char r2[] = s2.toCharArray();

            Arrays.sort(r1);
            Arrays.sort(r2);

            if(Arrays.equals(r1, r2))
                System.out.println("Strings are Anagrams");
            else
                System.out.println("Strings are not Anagrams");
        }
    }

    public static void main(String[] args)
    {
        // 1 - What are Strings

//        char str1[] = {'S', 'T', 'U', 'D', 'E', 'N', 'T'};
//        String str2 = "student47";
//        String str3 = new String("student47");
//
//        System.out.print("Character Array : ");
//        for(int i = 0; i < str1.length; i++)
//        {
//            System.out.print(str1[i]);
//        }
//
//        System.out.println("\nStatic String : "+ str2);
//        System.out.println("Dynamic String : "+ str3);

        // 2 - Input-Output

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your Name : ");
//        String name = input.nextLine();
//
//        System.out.println("Name : "+ name);

        // 3 - String Length

//        String str = "student47";
//        System.out.println("String is : "+ str);
//        System.out.println("Length is : "+ str.length());

        // 4 - String Concatenation

//        String str1 = "Gaurav ";
//        String str2 = "Pawar";
//
//        System.out.println("str1 is : "+ str1);
//        System.out.println("str2 is : "+ str2);
//        System.out.println("Concatenation : "+ str1.concat(str2));

        // 5 - String CharAt Method

//        String str = "student47";
//
//        System.out.println("String is : "+ str);
//        for(int i = 0; i < str.length(); i++)
//        {
//            System.out.println("Character At "+ i +" is : "+ str.charAt(i));
//        }

        // 6 - Check if String is Palindrome or (Question - 1)

//        String str = "noon";
//
//        _6_Palindrome(str);

        // 7 - Shortest Path (Question - 2)

//        String path = "WNEENESENNN";
//
//        _7_Shortest_Path(path);

        // 8 - String Function Compare

//        String s1 = "student47";
//        String s2 = "student47";
//        String s3 = new String("student47");
//
//        String r1 = s1 == s2 ? "EQUAL" : "UNEQUAL";
//        String r2 = s1 == s3 ? "EQUAL" : "UNEQUAL";
//        String r3 = s1.equals(s3) ? "EQUAL" : "UNEQUAL";
//
//        System.out.println("String s1 : "+ s1);
//        System.out.println("String s2 : "+ s2);
//        System.out.println("String s3 : "+ s3);
//
//        System.out.println("\ns1 and s2 : "+ r1);
//        System.out.println("s1 and s3 : "+ r2);
//        System.out.println("s1 and s3 : "+ r3);

        // 9 - String Function Substring

//        String str = "Gaurav Pawar";
//
//        System.out.println("String : "+ str);
//        System.out.println("Substring (0 to 6) : "+ str.substring(0, 7));
//        System.out.println("Substring (7 to 12) : "+ str.substring(7, 12));

        // 10 Print the Largest String (Question - 3)

//        String names[] = {"Apple", "Banana", "Mango"};
//        String largest = names[0];
//
//        for(int i = 0; i < names.length; i++)
//        {
//            System.out.println("Stirng "+ (i + 1) +" : "+ names[i]);
//        }
//
//        for(int i = 1; i < names.length; i++)
//        {
//            if(largest.compareTo(names[i]) < 0)
//                largest = names[i];
//        }
//
//        System.out.println("\nLargest String is : "+ largest);

        // 12 - String Builders

//        StringBuilder str = new StringBuilder();
//
//        for(char ch = 'A'; ch <= 'Z'; ch++)
//        {
//            str.append(ch +" ");
//        }
//        System.out.println("String : "+ str);

        // 13 - Convert Letters to Upper Case (Question - 4)

//        String str = "gaurav pawar";
//
//        _13_ConvertUpperCase(str);

        // 14 - String Compression

//        String str = "aaabbcccdd";
//
//        _14_StringCompression(str);

        // Assignment Q1 - Count how many times lowercase vowels  occurred in string entered by user

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a String : ");
//        String str = input.nextLine();
//
//        Q1_NoOfVowels(str);

        // Assignment Q2 - What will be the output of the following code ?

//        String str = "ShradhaDidi";
//        String str1 = "ApnaCollege";
//        String str2 = "ShradhaDidi";
//
//        System.out.println(str.equals(str1) +" "+ str.equals(str2));
        // --> false true

        // Assignment Q3 - What will be the output of the following code ?

//        String str = "ApnaCollege".replace("l", "");
//        System.out.println(str);

        // --> ApnaCoege

        // Assignment Q4 - Determine if 2 Strings are anagrams of each other

//        String str1 = "race";
//        String str2 = "care";
//
//        Q4_Anagrams(str1, str2);

        // Assignment Q5 - Search and Read About intern() and stringBuffer()

        // 1. intern()

//        String s1 = new String("student47");
//        String s2 = "student47";
//        String s3 = s1.intern();
//
//        System.out.println(s1.equals(s2) +" "+ s1.equals(s3));

        // 2. StringBuffer();

//        Scanner input = new Scanner(System.in);
//        StringBuffer str = new StringBuffer("Gaurav ");
//
//        System.out.print("Enter a String : ");
//        String str1 = input.next();
//        str.append(str1);
//
//        System.out.println("String Buffer : "+ str);
    }
}