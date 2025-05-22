package Programs.Chapter_6;

public class Ch6_15_Block_Scope
{
    public static void main(String[] args)
    {
        String str1 = "Declared outside the block";
        {
            String str2 = "Declared within the block";
            System.out.println("Execution in block");
            System.out.println(str1);
            System.out.println(str2);
        }

        System.out.println("\nExecution out side the block");
        //System.out.println(str2); // it will throw an error because as str2 is declared in block it will be
        // accessible modifiable and used within the block
        System.out.println(str1);
    }
}