package Programs.Chapter_6;

public class Ch6_Assignment_4
{
    public static void main(String[] args)
    {
        // Q. Search about(Google) & use the following methods of the Math class in Java

        //        a. Math.min( )
        //        b. Math.max( )
        //        c. Math.sqrt( )
        //        d. Math.pow( )
        //        e. Math.avg( ) // This method doesn't exist
        //        f. Math.abs( )

        System.out.println("The Minimum of 5 and 4 is : "+ Math.min(5, 4));
        System.out.println("The Maximum of 5 and 4 is : "+ Math.max(5, 4));
        System.out.println("The Square Root of 5 is : "+ (int) Math.sqrt(5));
        System.out.println("The Square Root of 4 is : "+ (int) Math.sqrt(4));
        System.out.println("The Power of 5 and 4 is : "+ (int) Math.pow(5, 4));
        System.out.println("The Absolute of 5.5f is : "+ (int) Math.abs(5.5f));
    }
}