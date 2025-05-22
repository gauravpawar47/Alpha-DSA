package Programs.Chapter_13;

class Animal_17
{
    Animal_17()
    {
        System.out.println("Animal Constructor Called");
    }

    public void func1()
    {
        System.out.println("Parent func1 Called");
    }
}

class Human_17 extends Animal_17
{
    Human_17()
    {
        System.out.println("Human Constructor Called");
    }


    public void func1()
    {
        super.func1();
    }
}

public class Ch13_17_Super_Keyword
{
    public static void main(String []args)
    {
        Human_17 obj = new Human_17();
        obj.func1();
    }
}