package Programs.Chapter_13;

class Animal_09
{
    public void eat(String animalName)
    {
        System.out.println(animalName +" is Eating");
    }

    public void sleep(String animalName)
    {
        System.out.println(animalName +" is Sleeping");
    }
}

class Mammals_09 extends Animal_09
{
    String type;

    public void hunting(String animalName, String food)
    {
        System.out.println(animalName +" is hunting for "+ food);
    }
}

class Dog_09 extends Mammals_09
{
    String bread;
    String color;

    public void bark(String animalName)
    {
        System.out.println(animalName +" is Barking");
    }
}

public class Ch13_09_Multi_Level_Inheritance
{
    public static void main(String []args)
    {
        Dog_09 obj = new Dog_09();

        obj.bread = "Labrador";
        obj.color = "White";
        obj.type = "Dog";

        obj.eat(obj.type);
        obj.sleep(obj.type);
        obj.hunting(obj.type, "Cat");
        obj.bark(obj.type);
    }
}