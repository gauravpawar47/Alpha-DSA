package Programs.Chapter_10;
import java.util.Scanner;

public class Ch10_01_Creation_2D_Array
{
    public static boolean search(int matrix[][], int key)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("\nFound at : ["+ i +"]["+ j +"]");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print("Enter the data for arr["+ i +"]["+ j +"] : ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nDisplaying Array Element\n");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] +" ");
                max = Math.max(matrix[i][j], max);
                min = Math.min(matrix[i][j], min);
            }
            System.out.println();
        }

        search(matrix, 5);
        System.out.println("Maximum Element from Matrix : "+ max);
        System.out.println("Minimum Element from Matrix : "+ min);
    }
}