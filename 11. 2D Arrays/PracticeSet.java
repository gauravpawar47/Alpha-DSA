public class PracticeSet
{   
    public static int Question1(int[][] matrix)
    {
        int count = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 7)
                {
                    count++;
                }
            }
        }

        return count;
    }

    public static int Question2(int[][] matrix)
    {
        int sum = 0;
        for(int i = 0; i < matrix[1].length; i++)
        {
            sum += matrix[1][i];
        }

        return  sum;
    }

    public static void Question3(int[][] matrix)
    {
        System.out.println("Transpose Matrix \n");
        for(int i = 0; i < matrix[0].length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[j][i] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // Q 1. Print Number of 7 in Matrix

        int[][] mat = {
                        {4, 7, 8}, 
                        {8, 8, 7}};

        System.out.println("Number of 7 in Matrix : "+ Question1(mat));
    
        // Q 2. Print the Sum of Integer of 2nd Row

        int[][] nums = {
                        {1, 4, 9}, 
                        {11, 4, 3}, 
                        {2, 2, 3}};
    
        System.out.println("Sum of 2nd Row : "+ Question2(nums));
    
        // Q 3. Transpose of Matrix

        int[][] matrix = {
                        {11, 12, 13}, 
                        {21, 22, 23}};

        Question3(matrix);
    }
}