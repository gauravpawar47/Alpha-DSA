package Programs.Chapter_13;

class Ch13_1_Student
{
    String name;
    int roll;
    int marks;

    public void setData(String name, int roll, int marks)
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public void getData()
    {
        System.out.println("\nName   : "+ name);
        System.out.println("Roll   : "+ roll);
        System.out.println("Marks  : "+ marks);
    }
}

class Ch13_2_Access_Modifiers
{
    public String username;
    private String password;

    public void setData(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    protected void getData()
    {
        System.out.println("Username : "+ username);
        System.out.println("Password : "+ password);
    }
}

class Ch13_3_Getter_Setter
{
    private String name;
    private int roll;

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    void setRoll(int roll)
    {
        this.roll = roll;
    }

    int getRoll()
    {
        return roll;
    }
}

class Ch13_5_Constructor
{
    private String name;
    private int roll;

    Ch13_5_Constructor(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public void getData()
    {
        System.out.println("\nName : "+ name);
        System.out.println("Roll : "+ roll);
    }
}

class Ch13_6_Constructor_Types
{
    private String name;
    public int roll;

    Ch13_6_Constructor_Types()
    {
        name = "default";
        roll = -1;
    }

    Ch13_6_Constructor_Types(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public void getData()
    {
        System.out.println("\nName : "+ name);
        System.out.println("Roll : "+ roll);
    }
}

class Ch13_7_Copy_Constructor
{
    private String name;
    private int roll;

    Ch13_7_Copy_Constructor(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    Ch13_7_Copy_Constructor(Ch13_7_Copy_Constructor obj)
    {
        this.name = obj.name;
        this.roll = obj.roll;
    }

    public void getData()
    {
        System.out.println("\nName : "+ name);
        System.out.println("Roll : "+ roll);
    }
}

class Ch13_8_Shallow_Deep
{
    private String name;
    private int roll;
    public int marks[] = new int[3];

    Ch13_8_Shallow_Deep(String name, int roll, int marks[])
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Shallow Copy
    Ch13_8_Shallow_Deep(Ch13_8_Shallow_Deep obj)
    {
        this.name = obj.name;
        this.roll = obj.roll;
        this.marks = obj.marks;
    }

    // Deep Copy
    Ch13_8_Shallow_Deep(Ch13_8_Shallow_Deep obj, String name)
    {
        this.name = name;
        this.roll = obj.roll;
        for(int i = 0; i < obj.marks.length; i++)
        {
            this.marks[i] = obj.marks[i];
        }
    }

    public void getData()
    {
        System.out.println("\nName : "+ name);
        System.out.println("Roll  : "+ roll +"\n");
        for(int i = 0; i < marks.length; i++)
        {
            System.out.println("Marks "+ (i + 1) +" is : "+ marks[i]);
        }
    }
}

class Ch13_10_1_Animal
{
    public void eat(String name)
    {
        System.out.println(name +" is Eating");
    }

    public void breath(String name)
    {
        System.out.println(name +" is breathing");
    }

    public void sleep(String name)
    {
        System.out.println(name +" is Sleeping");
    }
}

class Ch13_10_2_Fish extends Ch13_10_1_Animal
{
    public void fins(String name)
    {
        System.out.println(name +" has 4 Fins");
    }
}

class Ch13_12_1_Animal
{
    public void eat(String name)
    {
        System.out.println(name +" is Eating");
    }

    public void breath(String name)
    {
        System.out.println(name +" is Breathing");
    }

    public void sleep(String name)
    {
        System.out.println(name +" is Sleeping");
    }
}

class Ch13_12_2_Mammals extends Ch13_12_1_Animal
{
    public void hunting(String name, String food)
    {
        System.out.println(name +" is Hunting for "+ food);
    }
}

class Ch13_12_3_Dogs extends Ch13_12_2_Mammals
{
    public void bark(String name)
    {
        System.out.println(name +" is Barking");
    }
}

class Ch13_13_1_Animals
{
    public void eat(String name)
    {
        System.out.println(name +" is Eating");
    }

    public void breath(String name)
    {
        System.out.println(name +" is Breathing");
    }

    public void sleep(String name)
    {
        System.out.println(name +" is Sleeping");
    }
}

class Ch13_13_2_Dog extends Ch13_13_1_Animals
{
    public void sound()
    {
        System.out.println("Bhow Bhow");
    }
}

class Ch13_13_3_Cat extends Ch13_13_1_Animals
{
    public void sound()
    {
        System.out.println("Meow Meow");
    }
}

class Ch13_14_1_Animal
{
    public void eat(String name)
    {
        System.out.println(name +" is Eating");
    }

    public void breath(String name)
    {
        System.out.println(name +" is Breathing");
    }

    public void sleep(String name)
    {
        System.out.println(name +" is Sleeping");
    }
}

class Ch13_14_2_Bird extends Ch13_14_1_Animal
{
    public void fly(String name)
    {
        System.out.println(name +" is Flying");
    }
}

class Ch13_14_3_Fish extends Ch13_14_1_Animal
{
    public void swim(String name)
    {
        System.out.println(name +" is Swimming");
    }
}

class Ch13_14_4_Peacock extends Ch13_14_2_Bird
{
    public void quality(String name)
    {
        System.out.println(name +" is Dancing");
    }
}

class Ch13_14_5_Shark extends Ch13_14_3_Fish
{
    public void quality(String name)
    {
        System.out.println(name +" is King of Ocean");
    }
}

class Ch13_16_Sum
{
    public int sum(int a, int b)
    {
        return a + b;
    }

    public float sum(float a, float b)
    {
        return a + b;
    }
}

class Ch13_17_1_Animal
{
    public void eat()
    {
        System.out.println("Eating Meat");
    }
}

class Ch13_17_2_Cow extends Ch13_17_1_Animal
{
    @Override
    public void eat()
    {
        System.out.println("Eating Grass");
    }
}

abstract class Ch13_20_1_Animal
{
    abstract void eat(String name);
    abstract void breath(String name);
    abstract void sleep(String name);
}

class Ch13_20_2_Dog extends Ch13_20_1_Animal
{
    public void eat(String name)
    {
        System.out.println(name +" is Eating");
    }

    public void breath(String name)
    {
        System.out.println(name +" is Breathing");
    }

    public void sleep(String name)
    {
        System.out.println(name +" is Sleeping");
    }

    public void sound()
    {
        System.out.println("Bhow Bhow");
    }
}

interface Ch13_21_1_Carnivore
{
    abstract void grass(String name);
}

interface Ch13_21_2_Harbivore
{
    abstract void meat(String name);
}

class Ch13_21_1_Bear implements Ch13_21_1_Carnivore, Ch13_21_2_Harbivore
{
    public void grass(String name)
    {
        System.out.println(name +" is Eating Grass");
    }

    public void meat(String name)
    {
        System.out.println(name +" is Eating Meating");
    }
}

class Ch13_21_2_Cow implements Ch13_21_1_Carnivore
{
    public void grass(String name)
    {
        System.out.println(name +" is Eating Grass");
    }
}

class Ch13_22_Student
{
    private String name;
    private int roll;
    private static String college = "DYP IEMR";

    public void setData(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public void getData()
    {
        System.out.println("\nName    : "+ name);
        System.out.println("Roll    : "+ roll);
        System.out.println("College : "+ college);
    }
}

class Ch13_23_1_Base
{
    Ch13_23_1_Base()
    {
        System.out.println("Base Class Constructor is Called !");
    }

    public void func1()
    {
        System.out.println("\nBase Class Func1 is Called !");
    }
}

class Ch13_23_2_Derived extends Ch13_23_1_Base
{
    Ch13_23_2_Derived()
    {
        System.out.println("Derived Class Constructor is Called !");
    }

    public void func1()
    {
        super.func1();
        System.out.println("Derived Class Func1 is Called !");
    }
}

class Ch13_Q1_Complex
{
    private int real;
    private int imag;

    public Ch13_Q1_Complex(int real, int imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public Ch13_Q1_Complex sum(Ch13_Q1_Complex obj1, Ch13_Q1_Complex obj2)
    {
        return  new Ch13_Q1_Complex((obj1.real + obj2.real), (obj1.imag + obj2.imag));
    }

    public Ch13_Q1_Complex diff(Ch13_Q1_Complex obj1, Ch13_Q1_Complex obj2)
    {
        return  new Ch13_Q1_Complex((obj1.real - obj2.real), (obj1.imag - obj2.imag));
    }

    public void print()
    {
        if(real == 0 && imag != 0)
            System.out.println(imag +"i");
        else if(imag == 0 && real != 0)
            System.out.println(real);
        else
            System.out.println(real +"+"+ imag +"i");
    }
}

class Ch13_Q2_1_Automobile_A2
{
    private String drive()
    {
        return "Driving Vehicle";
    }
}

class Ch13_Q2_2_Car_A2 extends Ch13_Q2_1_Automobile_A2
{
    protected String drive()
    {
        return "Driving Car";
    }
}

class Ch13_Q3_1_Shape_A3
{
    protected void display()
    {
        System.out.println("Display-base");
    }
}

abstract class Ch13_Q4_1_Car_A4
{
    static
    {
        System.out.println("1");
    }

    public Ch13_Q4_1_Car_A4(String name)
    {
        super();
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

public class Ch13_00_Revision  extends Ch13_Q4_1_Car_A4  //Ch13_Q2_2_Car_A2,
{
//    @Override
//    public final String drive()
//    {
//        return "Driving Electric Car";
//    }

    {
        System.out.println("4");
    }

    public Ch13_00_Revision()
    {
        super("Blue");
        System.out.println("5");
    }

    public static void main(String[] args)
    {
        // 1 - Classes And Objects

//        Ch13_1_Student obj = new Ch13_1_Student();
//
//        obj.setData("Gaurav", 72, 98);
//        obj.setData("Aditya", 73, 95);
//
//        obj.getData();
//        obj.getData();

        // 2 - Access Specifiers

//        Ch13_2_Access_Modifiers obj = new Ch13_2_Access_Modifiers();
//
//        obj.setData("_.student._47", "__null__");
//        obj.getData();

        // 3 - Getters And Setters

//        Ch13_3_Getter_Setter obj = new Ch13_3_Getter_Setter();
//
//        obj.setName("Gaurav");
//        obj.setRoll(71);
//
//        System.out.println(obj.getName() +" - "+ obj.getRoll());

        // 5 - Constructor

//        Ch13_5_Constructor obj = new Ch13_5_Constructor("Gaurav", 72);
//        obj.getData();

        // 6 - Types Of Constructors

//        Ch13_6_Constructor_Types obj1 = new Ch13_6_Constructor_Types();
//        obj1.getData();
//
//        Ch13_6_Constructor_Types obj2 = new Ch13_6_Constructor_Types("Gaurav", 72);
//        obj2.getData();

        // 7 - Copy Constructor

//        Ch13_7_Copy_Constructor temp = new Ch13_7_Copy_Constructor("Gaurav", 72);
//        Ch13_7_Copy_Constructor obj = new Ch13_7_Copy_Constructor(temp);
//
//        temp.getData();
//        obj.getData();

         // 8 - Shallow Copy & Deep Copy

//        int marks[] = {92, 95, 98};
//
//        Ch13_8_Shallow_Deep obj1 = new Ch13_8_Shallow_Deep("Gaurav", 72, marks);
//        obj1.getData();
//
//        Ch13_8_Shallow_Deep obj2 = new Ch13_8_Shallow_Deep(obj1);
//        obj2.getData();
//
//        obj1.marks[0] = 85;
//
//        Ch13_8_Shallow_Deep obj3 = new Ch13_8_Shallow_Deep(obj1);
//        obj3.getData();

        // 10 - Inheritance

//        Ch13_10_2_Fish fish = new Ch13_10_2_Fish();
//
//        fish.eat("Fish");
//        fish.breath("Fish");
//        fish.fins("Fish");
//        fish.sleep("Fish");


        // 12 - Multi Level Inheritance

//        Ch13_12_3_Dogs dog = new Ch13_12_3_Dogs();
//
//        dog.eat("Dog");
//        dog.breath("Dog");
//        dog.hunting("Dog", "Fish");
//        dog.bark("Dog");
//        dog.sleep("Dog");

        // 13 - Hierarchial Inheritance

//        Ch13_13_2_Dog dog = new Ch13_13_2_Dog();
//
//        dog.eat("Dog");
//        dog.breath("Dog");
//        dog.sound();
//        dog.sleep("Dog");
//
//        Ch13_13_3_Cat cat = new Ch13_13_3_Cat();
//
//        cat.eat("\nCat");
//        cat.breath("Cat");
//        cat.sound();
//        cat.sleep("Cat");

        // 14 - Hybrid Inheritance

//        Ch13_14_4_Peacock peacock = new Ch13_14_4_Peacock();
//
//        peacock.eat("Peacock");
//        peacock.breath("Peacock");
//        peacock.fly("Peacock");
//        peacock.quality("Peacock");
//        peacock.sleep("Peacock");
//
//
//        Ch13_14_5_Shark shark = new Ch13_14_5_Shark();
//
//        shark.eat("\nShark");
//        shark.breath("Shark");
//        shark.swim("Shark");
//        shark.quality("Shark");
//        shark.sleep("Shark");

        // 16 - Method Overloading

//        Ch13_16_Sum obj = new Ch13_16_Sum();
//
//        System.out.println("5 and 6 : "+ obj.sum(5, 6));
//        System.out.println("4.1 and 5.9 : "+ obj.sum(4.1f, 5.9f));

        // 17 - Method Overriding

//        Ch13_17_2_Cow cow = new Ch13_17_2_Cow();
//        cow.eat();

        // 20 - Abstract Class

//        Ch13_20_2_Dog dog = new Ch13_20_2_Dog();
//
//        dog.eat("Dog");
//        dog.breath("Dog");
//        dog.sound();
//        dog.sleep("Dog");

        // 21 - Interface

//        Ch13_21_1_Bear bear = new Ch13_21_1_Bear();
//
//        bear.grass("Bear");
//        bear.meat("Bear");
//
//        Ch13_21_2_Cow cow = new Ch13_21_2_Cow();
//
//        cow.grass("\nCow");

        // 22 - Static Keyword

//        Ch13_22_Student obj1 = new Ch13_22_Student();
//
//        obj1.setData("Gaurav Pawar", 72);
//        obj1.getData();
//
//        Ch13_22_Student obj2 = new Ch13_22_Student();
//
//        obj2.setData("Somesh Gaikwad", 71);
//        obj2.getData();

        // 23 - Super Keyword

//        Ch13_23_2_Derived obj = new Ch13_23_2_Derived();
//
//        obj.func1();

        // Assignment Q1 - Print the sm and difference of two complex numbers

//        Ch13_Q1_Complex obj = new Ch13_Q1_Complex(5, 8);
//        obj.print();

        // Assignment Q2 - What is the output of the following program ?

//        final Ch13_Q2_2_Car_A2 car = new Ch13_00_Revision();
//        System.out.println(car.drive());

        // --> B. Driving Electric Car

        // Assignment Q3 - Look at the following code and choose the right option for the word

        // <access - modifier> void display()
//        {
//            System.out.println("Display-derived");
//        }

        // --> B. Public and Protected Both can be used

        // Assignment Q4 - What is the Output of the Following Program ?

//        new Ch13_00_Revision();

        // --> 12345

        // Assignment Q5 - Reading Material

        // --> Done
    }
}