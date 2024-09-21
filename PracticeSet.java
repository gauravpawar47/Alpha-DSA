import java.util.Scanner;

public class PracticeSet
{
    public static void main(String[] args)
    {
        // Q 1. Average of 3 Numbers (Input - A, B, C)    
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number A : ");
        int a = input.nextInt();

        System.out.print("Enter Number B : ");
        int b = input.nextInt();
        
        System.out.print("Enter Number C : ");
        int c = input.nextInt();
    
        System.out.println("\nAverage : "+ (a + b + c) / 3);

        // Q 2. Side of Square (Input - Side)

        System.out.print("Enter Side : ");
        int side = input.nextInt();

        System.out.println("Square of "+ side +" is : "+ (side * side));

        // Q 3. GST Calculate (Input - Pen, Pencil, Eraser)

        System.out.print("Enter Cost of Pen: ");
        float pen = input.nextFloat();

        System.out.print("Enter Cost of Pencil : ");
        float pencil = input.nextFloat();
        
        System.out.print("Enter Cost of Eraser : ");
        float eraser = input.nextFloat();
    
        System.out.println("\nAverage : "+ (a + b + c) + ((a + b + c) * 0.18));


        // Q 4. Output 

        // --> Double

        // Q 5. Output

        // --> Makes Use of Special Symbol it will Throw Error
    }
}