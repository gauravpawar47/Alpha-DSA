package Programs.Chapter_13;

class Animal_08
{
    public void eat(String name)
    {
        System.out.println(name +" is Eating");
    }

    public void breathe(String name)
    {
        System.out.println(name +" is Breathing");
    }

    public void sleep(String name)
    {
        System.out.println(name +" is Sleeping");
    }
}

class Fish_08 extends Animal_08
{
    public void fins(int fins)
    {
        System.out.println("Fish has "+ fins +" fins");
    }
}

public class Ch13_08_Inheritance
{
    public static void main(String []args)
    {
        Fish_08 f1 = new Fish_08();

        f1.eat("Fish");
        f1.breathe("Fish");
        f1.sleep("Fish");
        f1.fins(8);
    }
}