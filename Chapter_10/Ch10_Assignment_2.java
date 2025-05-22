package Programs.Chapter_10;

public class Ch10_Assignment_2
{
    public static int sum(int matrix[][], int row)
    {
        int sum = 0;

        for(int j = 0; j < matrix[0].length; j++)
        {
            sum += matrix[1][j];
        }
        return sum;
    }

    public static void main(String []args)
    {
        // Q. Print out the sum of the numbers in the second row of the "nums" array

        int matrix[][] = {{1, 4, 9},
                          {11, 4, 3},
                          {2, 2, 3}};

        int sum = sum(matrix, 2);
        System.out.print("Sum is : "+ sum);
    }
}