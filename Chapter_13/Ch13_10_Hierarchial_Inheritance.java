package Programs.Chapter_13;

class Animal_10
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

class Dog_10 extends Animal_10
{
   public void sound()
   {
       System.out.println("Bhow Bhow\n");
   }
}

class Cat_10 extends Animal_10
{
    public void sound()
    {
        System.out.println("Meow Meow\n");
    }
}

public class Ch13_10_Hierarchial_Inheritance
{
    public static void main(String []args)
    {
        Dog_10 obj1 = new Dog_10();

        obj1.eat("Dog");
        obj1.sleep("Dog");
        obj1.sound();

        Cat_10 obj2 = new Cat_10();

        obj2.eat("Cat");
        obj2.sleep("Cat");
        obj2.sound();
    }
}