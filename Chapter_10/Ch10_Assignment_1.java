package Programs.Chapter_10;

public class Ch10_Assignment_1
{
    public static int elementCount(int matrix[][], int key)
    {
        int count = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == key)
                    count++;
            }
        }
        return count;
    }

    public static void main(String []args)
    {
        // Q. Print the number of 7's that are in the 2nd Array

        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};

        int count = elementCount(matrix, 7);
        System.out.println("The Count of 7 : "+ count);
    }
}