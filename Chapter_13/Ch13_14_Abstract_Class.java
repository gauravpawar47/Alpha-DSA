package Programs.Chapter_13;

abstract class Animal_14
{
    String color;
    Animal_14()
    {
        color = "brown";
    }
    abstract void eat();
    abstract void walk();
}

class Dog_14 extends Animal_14
{
    public void eat()
    {
        System.out.println("Dog is Eating");
    }

    public void walk()
    {
        System.out.println("Dog walks on 4 Legs");
    }

    public void run()
    {
        System.out.println("Dog runs on 4 Legs");
    }
}

public class Ch13_14_Abstract_Class
{
    public static void main(String []args)
    {
        Dog_14 obj1 = new Dog_14();

        obj1.eat();
        obj1.walk();
        obj1.run();
        System.out.println(obj1.color = "White");
    }
}