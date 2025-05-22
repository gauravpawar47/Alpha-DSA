package Programs.Chapter_13;

class Animal_11
{
    public void eat(String aName)
    {
        System.out.println(aName +" is Eating");
    }
}

class Fish_11 extends Animal_11
{
    protected String color;
    public void swim(String fishName)
    {
        System.out.println(fishName +" is Swimming");
    }
}

class Shark_11 extends Fish_11
{
    public void fins(int fins)
    {
        super.color = "Grey";
        System.out.println("Shark has "+ fins +" Fins");
    }
}

class Tuna_11 extends Fish_11
{
    public void fins(int fins)
    {
        super.color = "Yellow";
        System.out.println("Tuna has "+ fins +" Fins");
    }
}

class Bird_11 extends Animal_11
{
    public void fly(String birdName)
    {
        System.out.println(birdName +" is Flying");
    }
}

class Peacock_11 extends Bird_11
{
    public void quality()
    {
        System.out.println("Peacock is Dancing");
    }
}

class Mammals_11 extends Animal_11
{
    public void hunt(String animalName, String food)
    {
        System.out.println(animalName +" is hunting for "+ food);
    }
}

class Dog_11 extends Mammals_11
{
    public void quality()
    {
        System.out.println("Dogs are Loyal");
    }
}

class Cat_11 extends Mammals_11
{
    public void quality()
    {
        System.out.println("Cats are Cute");
    }
}

class Human_11 extends Mammals_11
{
    public void quality()
    {
        System.out.println("Humans can Evolve");
    }
}

public class Ch13_11_Hybrid_Inheritance
{
    public static void main(String []args)
    {
        Shark_11 obj1 = new Shark_11();

        obj1.eat("Shark");
        obj1.swim("Shark");
        obj1.fins(5);

        Tuna_11 obj2 = new Tuna_11();

        obj2.eat("Tuna");
        obj2.swim("Tuna");
        obj2.fins(15);

        Peacock_11 obj3 = new Peacock_11();

        obj3.eat("Peacock");
        obj3.fly("Peacock");
        obj3.quality();

        Dog_11 obj4 = new Dog_11();
        obj4.hunt("Dog", "Cat");

        Cat_11 obj5 = new Cat_11();
        obj5.eat("Cat");

        Human_11 obj6 = new Human_11();
        obj6.quality();
    }
}