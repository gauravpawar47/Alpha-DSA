package Programs.Chapter_1;

public class Ch1_03_Variables
{
    public static void main(String []args)
    {
        int a = 10;
        int b = 5;
        String name = "Gaurav Pawar..";

        System.out.println("The Value of a is : "+ a);
        System.out.println("The Value of b is : "+ b);
        System.out.println("The Name is : "+ name);

        a = b;
        System.out.println("Current Value of a is : "+ a);
    }
}