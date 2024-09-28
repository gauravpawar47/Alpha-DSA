public class _6_Spiral_Matrix
{
    public static void spiralMatrix(int[][] matrix)
    {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColn = 0;
        int endColn = matrix[0].length - 1;

        while(startRow <= endRow && startColn <= endColn)
        {
            // Top
            for(int j = startColn; j <= endColn; j++)
            {
                System.out.print(matrix[startRow][j] +" ");
            }

            // Right
            for(int i = startRow + 1; i <= endRow; i++)
            {
                System.out.print(matrix[i][endColn] +" ");
            }

            // Bottom
            for(int j = endColn - 1; j >= startColn; j--)
            {
                if(startColn == endColn)
                {
                    break;
                }
                System.out.print(matrix[endRow][j] +" ");
            }

            // Left
            for(int i = endRow - 1; i >= startRow + 1; i--)
            {
                if(startRow == endRow)
                {
                    break;
                }
                System.out.print(matrix[i][startColn] +" ");
            }

            startRow++;
            endRow--;
            startColn++;
            endColn--;
        }
    }

    public static void main(String[] args)
    {
        int[][] matrix = {
                        {1, 2, 3, 4}, 
                        {5, 6, 7, 8}, 
                        {9, 10, 11, 12}, 
                        {13, 14, 15, 16}};
                        
        spiralMatrix(matrix);
    }
}