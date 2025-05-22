package Programs.Chapter_11;

public class Ch11_08_Compare
{
    public static void main(String []args)
    {
        String s1 = "Gaurav";
        String s2 = "Gaurav";
        String s3 = new String("Gaurav");

        String r1 = s1 == s2 ? "Equal" : "Unequal";
        String r2 = s1 == s3 ? "Equal" : "Unequal";
        String r3 = s1.equals(s3) ? "Equal" : "Unequal";

        System.out.println("S1 and S2 : "+ r1);
        System.out.println("S1 and S3 : "+ r2); // Unequal due to interning
        System.out.println("S1 and S3 : "+ r3);
    }
}