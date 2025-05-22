package Programs.Chapter_1;

public class Ch1_12_Type_Casting
{
    public static void main(String []args)
    {
        double a = 22222.445555;
        float b = (float) a;
        long c = (long) b;
        int d = (int) c;
        short e = (short) d;
        byte f = (byte) e;
        char g = 'z';
        int d2 = g;
        boolean h = true;

        System.out.println("Explicit Typecasting or Narrowing");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);
        System.out.println("d : "+ d);
        System.out.println("d2 : "+ d2);
        System.out.println("e : "+ e);
        System.out.println("f : "+ f);
        System.out.println("g : "+ g);
    }
}