public class _16_Sudoku
{
    public static boolean sudokuSolver(int[][] sudoku, int row, int col)
    {
        // Step 1 : Base-Case
        if(row == 9 && col == 0)
        {
            return true;
        }

        // Step 2 : Kaam
        int nextRow = row;
        int nextCol = col + 1;
        if(col + 1 == 9)
        {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Step 3 : Inner Function Call
        if(sudoku[row][col] != 0)
        {
            return sudokuSolver(sudoku, nextRow, nextCol);  
        }

        for(int i = 1; i <= 9; i++)
        {
            if(isSafe(sudoku, row, col, i))
            {
                sudoku[row][col] = i;
                // Step 3 : Inner Function Call 
                if(sudokuSolver(sudoku, nextRow, nextCol))
                {
                    return true;
                }
                
                // Step 4 : Backtrack Step
                sudoku[row][col] = 0;
            }
        }
        
        return false;
    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit)
    {
        // Case 1 : Same Column
        for(int i = 0; i <= 8; i++)
        {
            if(sudoku[i][col] == digit)
            {
                return false;
            }
        }

        // Case 2 : Same Row
        for(int j = 0; j <= 8; j++)
        {
            if(sudoku[row][j] == digit)
            {
                return false;
            }
        }

        // Case 3 : Same Grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
    
        for(int i = startRow; i < startRow + 3; i++)
        {
            for(int j = startCol; j < startCol + 3; j++)
            {
                if(sudoku[i][j] == digit)
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int[][] sudoku)
    {
        System.out.println("\n-----SUDOKU SOLVED -----");
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                System.out.print(sudoku[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                        {4, 9, 0, 1, 5, 7, 0, 0, 2},
                        {0, 0, 3, 0, 0, 4, 1, 9, 0},
                        {1, 8, 5, 0, 6, 0, 0, 2, 0},
                        {0, 0, 0, 0, 2, 0, 0, 6, 0},
                        {9, 6, 0, 4, 0, 5, 3, 0, 0},
                        {0, 3, 0, 0, 7, 2, 0, 0, 4},
                        {0, 4, 9, 0, 3, 0, 0, 5, 7},
                        {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if(sudokuSolver(sudoku, 0, 0))
        {
            System.out.println("Solution Exist");
            printSudoku(sudoku);
        }        
        else
        {
            System.out.println("Solution Doesn't Exist");
        }
    }
}