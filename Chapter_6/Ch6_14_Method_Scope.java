package Programs.Chapter_6;

public class Ch6_14_Method_Scope
{
    public static void printA()
    {
        //System.out.println(a); // It'll throw an error because the variable a is defined under main() method and we
        // are
        // trying to access in printA() method that's called as Method Scope ...

        /*
            In method scope anything that is declared in the method will be used, accessible, modifiable within that
             method
         */
    }

    public static void main(String[] args)
    {
        int a = 5;
        printA();
    }
}