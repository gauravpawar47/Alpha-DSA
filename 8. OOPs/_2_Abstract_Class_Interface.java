abstract class animal
{
    public void eat(String str)
    {
        System.out.println("Eating "+ str);
    }

    abstract void hunt();
}

class Cat extends animal
{
    public void hunt()
    {
        System.out.println("Cat is Hunting for Mouse !");
    }
}

interface Cars
{
    abstract void name(String name);
    abstract void model(String model);
    abstract void brand(String brand);
    abstract void type(String type);
}

class Car implements Cars
{
    @Override
    public void name(String name)
    {
        System.out.println("Car Name : "+ name);
    }

    @Override
    public void model(String model)
    {
        System.out.println("Car Model : "+ model);
    }
    
    @Override
    public void brand(String brand)
    {
        System.out.println("Car Brand : "+ brand);
    }
    
    @Override
    public void type(String type)
    {
        System.out.println("Car Type : "+ type);
    }
}

public class _2_Abstract_Class_Interface
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        cat.eat("Cat");
        cat.hunt();
 
        Car car = new Car();

        car.name("VIRTUS GT");
        car.model("2024");
        car.brand("WOLKSWAGON");
        car.type("SEDAN");
    }
}