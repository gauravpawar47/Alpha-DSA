package Programs.Chapter_1;
import java.util.Scanner;

public class Ch1_07_Inputs
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Byte Value : ");
        byte var1 = input.nextByte(); // nextByte() used to take the Byte input

        System.out.print("Enter the Short Value : ");
        short var2 = input.nextShort(); // nextShort() used to take the Short input

        System.out.print("Enter the Integer Value : ");
        int var3 = input.nextInt(); // nextInt() used to take the Integer input

        System.out.print("Enter the Long Value : ");
        long var6 = input.nextLong(); // nextLong() used to take the Long input

        System.out.print("Enter the Floating Value : ");
        float var4 = input.nextFloat(); // nextFloat() used to take the Floating input

        System.out.print("Enter the Double Value : ");
        double var5 = input.nextDouble(); // nextDouble() used to take the Double input

        System.out.print("Enter the Character Value : ");
        char var7 = input.next().charAt(0); // next().charAt(0) used to take the Character input

        System.out.print("Enter the Boolean Value : ");
        boolean var8 = input.nextBoolean(); // nextBoolean() used to take the Boolean input

        System.out.println();
        System.out.println("The Value of Byte : "+ var1);
        System.out.println("The Value of Short : "+ var2);
        System.out.println("The Value of Integer : "+ var3);
        System.out.println("The Value of Long : "+ var4);
        System.out.println("The Value of Float : "+ var5);
        System.out.println("The Value of Double : "+ var6);
        System.out.println("The Value of Character : "+ var7);
        System.out.println("The Value of Boolean : "+ var8);
    }
}