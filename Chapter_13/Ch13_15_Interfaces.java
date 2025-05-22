package Programs.Chapter_13;

interface Herbivore_15
{
    abstract void grass();
}

interface Carnivore_15
{
    abstract void meat();
}

class Bear_15 implements Herbivore_15, Carnivore_15
{
    public void grass()
    {
        System.out.println("Bear Eating Grass");
    }

    public void meat()
    {
        System.out.println("Bear Eating Meat");
    }
}

class Cow_15 implements Herbivore_15
{
    public void grass()
    {
        System.out.println("Cow Eating Grass");
    }
}

public class Ch13_15_Interfaces
{
    public static void main(String []args)
    {
        Bear_15 obj1 = new Bear_15();
        obj1.grass();
        obj1.meat();

        Cow_15 obj2 = new Cow_15();
        obj2.grass();
    }
}