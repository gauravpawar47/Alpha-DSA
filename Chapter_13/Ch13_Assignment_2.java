package Programs.Chapter_13;

class Automobile_A2
{
    private String drive()
    {
        return "Driving Vehicle";
    }
}

class Car_A2 extends Automobile_A2
{
    protected String drive()
    {
        return "Driving Car";
    }
}

public class Ch13_Assignment_2 extends Car_A2
{
    @Override
    public final String drive()
    {
        return "Driving Electric Car";
    }

    public static void main(String []args)
    {
        // Q. What is the output of the following program

        final Car_A2 car = new Ch13_Assignment_2();
        System.out.println(car.drive());

        // --> B. Driving Electric Car
    }
}