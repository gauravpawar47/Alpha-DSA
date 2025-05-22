package Programs.Chapter_13;

class Animal_13
{
    public void eat()
    {
        System.out.println("Eating Grass");
    }
}

class Lion_13 extends Animal_13
{
    public void eat()
    {
        System.out.println("Eating Meat");
    }
}

public class Ch13_13_Method_Overriding
{
    public static void main(String []args)
    {
        Lion_13 obj1 = new Lion_13();
        obj1.eat();
    }
}