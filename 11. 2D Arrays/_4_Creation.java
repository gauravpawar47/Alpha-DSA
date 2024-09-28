import java.util.Scanner;

public class _4_Creation
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[3][3];

        Scanner input = new Scanner(System.in);
    
        // Input
        for(int i = 0; i < matrix.length; i++)
        {
            System.out.println("\nEnter the data for "+ i +"th row ");
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print("Enter the data for "+ j +"th column : ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Print
        System.out.println("\nMatrix Data \n");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}