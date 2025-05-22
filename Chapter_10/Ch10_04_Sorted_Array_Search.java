package Programs.Chapter_10;

public class Ch10_04_Sorted_Array_Search
{
    public static boolean stairCaseSearch1(int matrix[][], int key)
    {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.print("Found at : ["+ row +", "+ col +"]\n");
                return true;
            }
            else if(key < matrix[row][col]) // moving to right if key is less
                col--;
            else // moving to bottom if key is greater
                row++;
        }
        System.out.println("Key doesn't found");
        return false;
    }

    public static boolean stairCaseSearch2(int matrix[][], int key)
    {
        int row = matrix.length - 1;
        int col = 0;

        while(row >= 0 && col < matrix.length)
        {
            if(matrix[row][col] == key)
            {
                System.out.print("Found at : ["+ row +", "+ col +"]\n");
                return true;
            }
            else if(key < matrix[row][col]) // moving to left if key is less
                row--;
            else // moving to right if key is greater
                col++;
        }
        System.out.println("Key doesn't found");
        return false;
    }

    public static void main(String []args)
    {
        int matrix[][] = {{10, 15, 30, 40},
                          {16, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        stairCaseSearch1(matrix, 33);
        stairCaseSearch2(matrix, 30);
    }
}