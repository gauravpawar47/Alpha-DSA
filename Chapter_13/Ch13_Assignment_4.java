package Programs.Chapter_13;

abstract class Car_A4
{
    static
    {
        System.out.println("1");
    }

    public Car_A4(String name)
    {
        super();
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

public class Ch13_Assignment_4 extends Car_A4
{
    {
        System.out.println("4");
    }

    public Ch13_Assignment_4()
    {
        super("Blue");
        System.out.println("5");
    }

    public static void main(String []args)
    {
        // Q. What is the output of the following program ?
        new Ch13_Assignment_4();

        // --> C. 13245
    }
}