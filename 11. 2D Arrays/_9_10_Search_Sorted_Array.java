public class _9_10_Search_Sorted_Array
{
    public static void stairCaseSearch1(int[][] matrix, int key)
    {
        int row = 0;
        int coln = matrix[0].length - 1;
    
        while(row <= matrix.length - 1 && coln >= 0)
        {
            if(matrix[row][coln] == key)
            {
                System.out.println("Key Found at ("+ row +", "+ coln +")");
                return;
            }
            else if(matrix[row][coln] > key)
            {
                coln--;
            }
            else
            {
                row++;
            }
        }

        System.out.println("Key Doesn't Exist");
        return;
    }

    public static void stairCaseSearch2(int[][] matrix, int key)
    {
        int row = matrix.length - 1;
        int coln = 0;

        while(row >= 0 && coln <= matrix.length - 1)
        {
            if(matrix[row][coln] == key)
            {

                System.out.println("Key Found at ("+ row +", "+ coln +")");
                return;
            }
            else if(matrix[row][coln] > key)
            {
                row --;
            }
            else
            {
                coln++;
            }
        }

        System.out.println("Key Doesn't Exist");
        return;
    }

    public static void main(String[] args)
    {
        int[][] matrix = {
                        {10, 20, 30, 40}, 
                        {15, 25, 35, 45}, 
                        {27, 29, 37, 48}, 
                        {32, 33, 39, 50}};

        int key = 30;
        stairCaseSearch1(matrix, key);
        stairCaseSearch2(matrix, key);
    }
}