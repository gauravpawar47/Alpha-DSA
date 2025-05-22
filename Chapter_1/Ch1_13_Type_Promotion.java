package Programs.Chapter_1;

public class  Ch1_13_Type_Promotion
{
    public static void main(String []args)
    {
        // Type promotion is nothing, but it automatically converts the lower range value to higher range value

        // Type 1 - Byte,Short,Char to Int
        byte a = 125;
        short b = 2343;
        char ch = 'a';
        int sum = a + b + ch; // it will convert all those lower range datatypes to higher range

        System.out.println("The Integer value of ch is : "+ (int) ch);
        System.out.println("The sum of all expression is : "+ sum);

        // Type 2 - Long, Double, Float - converts entire expression into one of them
        int c = 23213;
        long e = 232134343;
        float d = 232132.343f;
        double f = 3232131231.3223;
        double sum2 = c + e + d + f; // it will convert entire expression into double as the double has high data range

        System.out.println("The sum of all expression is : "+ sum2);
    }
}