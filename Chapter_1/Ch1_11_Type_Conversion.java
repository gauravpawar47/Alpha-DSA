package Programs.Chapter_1;

public class Ch1_11_Type_Conversion
{
    public static void main(String []args)
    {
        byte a = 2;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("Implicit Conversion or Widening");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);
        System.out.println("d : "+ d);
        System.out.println("e : "+ e);
        System.out.println("f : "+ f);
    }
}