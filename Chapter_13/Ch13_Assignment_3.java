package Programs.Chapter_13;

// Shape.java
class Shape_A3
{
    protected void display()
    {
        System.out.println("Display-base");
    }
}

// Circle (Main Class)
public class Ch13_Assignment_3
{
    public static void main(String []args)
    {
        // Q. Look at the following code and choose the right option for the word

        // <access - modifier> void display()
        {
            System.out.println("Display-derived");
        }

        // --> B. Public and Protected Both can be used
    }
}