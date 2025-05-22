package Programs.Chapter_10;
import java.util.Scanner;

public class Ch10_00_Revision
{
    public static void _4_Search(int[][] mat, int key)
    {
        for (int i = 0; i < mat[0].length; i++)
        {
            for (int j = 0; j < mat[1].length; j++)
            {
                if (mat[i][j] == key) {
                    System.out.println("Element Found at Row (" + i + ") Column (" + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element Doesn't Exist");
    }

    public static void _6_SpiralMatrix(int matrix[][])
    {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol)
        {
            // top
            for (int j = startCol; j <= endCol; j++)
            {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++)
            {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--)
            {
                if (startRow == endRow)
                    break;

                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--)
            {
                if (startCol == endCol)
                    break;

                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static int _7_1_DiagonalSum(int matrix[][])
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (i == j)
                    sum += matrix[i][j];
                else if (i + j == matrix.length - 1)
                    sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static int _7_2_DiagonalSum(int matrix[][])
    {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            // pd
            sum += matrix[i][i];

            // sd
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];
        }

        return sum;
    }


    public static void _8_1_SearchSortedMatrix(int matrix[][], int key)
    {
        int row = 0;
        int col = matrix.length - 1;

        while (row <= matrix.length - 1 && col >= 0)
        {
            if (key == matrix[row][col])
            {
                System.out.println(key + " is Found At : [" + row + ", " + col + "]");
                return;
            }
            else if (key < matrix[row][col])
                col -= 1;
            else
                row += 1;
        }

        System.out.println("Key Does Not Found !");
    }

    public static void _8_2_SearchSortedMatrix(int matrix[][], int key)
    {
        int row = matrix.length - 1;
        int col = 0;

        while(row >= 0 && col < matrix.length)
        {
            if(key == matrix[row][col])
            {
                System.out.println(key + " is Found At : [" + row + ", " + col + "]");
                return;
            }
            else if(key > matrix[row][col])
                col += 1;
            else
                row -= 1;
        }

        System.out.println("Key Does Not Found !");
    }

    public static void Q1_NumberOf7(int matrix[][], int key)
    {
        int count = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(key == matrix[i][j])
                    count++;
            }
        }
        System.out.println("Count Of "+ key +" is : "+ count);
    }

    public static void Q2_Sum(int nums[][])
    {
        int sum = 0;
        for(int i = 0; i < nums[1].length; i++)
        {
            sum += nums[1][i];
        }

        System.out.println("Sum of Second Row : "+ sum);
    }

    public static void Q3_Transpose(int matrix[][])
    {
        int transpose[][] = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < transpose.length; i++)
        {
            for(int j = 0; j < transpose[0].length; j++)
            {
                transpose[i][j] = matrix[j][i];
            }
        }

        for(int i = 0; i < transpose.length; i++)
        {
            for(int j = 0; j < transpose[0].length; j++)
            {
                System.out.print("("+ transpose[i][j] +") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // 4 - Creation of 2D-Arrays

//        Scanner input = new Scanner(System.in);
//        int mat[][] = new int[3][3];
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i = 0; i < mat[0].length; i++)
//        {
//            for(int j = 0; j < mat[1].length; j++)
//            {
//                System.out.print("Enter the Data for Row ("+ i +") Column ("+ j +") : ");
//                mat[i][j] = input.nextInt();
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        for(int i = 0; i < mat[0].length; i++)
//        {
//            for(int j = 0; j < mat[1].length; j++)
//            {
//                if(min >= mat[i][j])
//                    min = mat[i][j];
//
//                if(max <= mat[i][j])
//                    max = mat[i][j];
//
//                System.out.println("Row ("+ i +") Column ("+ j +") : "+ mat[i][j]);
//            }
//            System.out.println();
//        }
//
//        _4_Search(mat, 90);
//        System.out.println("Maximum In Matrix : "+ max);
//        System.out.println("Minimum In Matrix : "+ min);

        // 6 - Spiral Matrix

//        int matrix[][] = {{1, 2, 3, 4},
//                          {5, 6, 7, 8},
//                          {9, 10, 11, 12},
//                          {13, 14, 15, 16}};
//
//        _6_SpiralMatrix(matrix);

        // 7 - Diagonal Sum

//        int matrix[][] = {{1, 2, 3, 4},
//                          {5, 6, 7, 8},
//                          {9, 10, 11, 12},
//                          {13, 14, 15, 16}};
//
//        System.out.println("Diagonal Sum : "+ _7_1_DiagonalSum(matrix)); // Brute Force O(n^2)
//        System.out.println("Diagonal Sum : "+ _7_2_DiagonalSum(matrix)); // Optimized O(n)

        // 8 - Search in Sorted Matrix

//        int matrix[][] = {{10, 20, 30, 40},
//                {15, 25, 35, 45},
//                {27, 29, 37, 48},
//                {32, 33, 39, 50}};
//
//        _8_1_SearchSortedMatrix(matrix, 27);
//        _8_2_SearchSortedMatrix(matrix, 45);

        // Assignment Q1 - Print the Number of 7's that are in 2d Array;

//        int matrix[][] = {{4, 7, 8},
//                          {8, 8, 7}};
//
//        Q1_NumberOf7(matrix, 7);

        // Assignment Q2 - Print out the sum of numbers in the second row of the 'nums' array

//        int nums[][] = {{1, 4, 9},
//                        {11, 4, 3},
//                        {2, 2, 3}};
//
//        Q2_Sum(nums);

        // Assignment Q3 - Write a Program to Find Transpose of a Matrix

//        int matrix[][] = {{11, 12, 13},
//                          {21, 22, 23}};
//
//        Q3_Transpose(matrix);
    }
}