package Programs.Chapter_17;

public class Ch17_08_Sudoku
{
    public static boolean isSafe(int sudoku[][], int row, int coln, int digit)
    {
        // Column
        for(int i = 0; i <= 8; i++)
        {
            if(sudoku[i][coln] == digit)
                return false;
        }

        // Row
        for(int j = 0; j <= 8; j++)
        {
            if(sudoku[row][j] == digit)
                return false;
        }

        // Grid
        int sr = (row / 3) * 3;
        int sc = (coln / 3) * 3;

        for(int i = sr; i < sr + 3; i++)
        {
            for(int j = sc; j < sc + 3; j++)
            {
                if(sudoku[i][j] == digit)
                    return false;
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int coln)
    {
        //basecase
        if(row == 9 && coln == 0)
            return true;

        //work to be done
        int nextRow = row;
        int nextColn = coln + 1;

        if(coln + 1 == 9)
        {
            nextRow = row + 1;
            nextColn = 0;
        }

        if(sudoku[row][coln] != 0)
            return sudokuSolver(sudoku, nextRow, nextColn);

        for(int i = 1; i <= 9; i++)
        {
            if(isSafe(sudoku, row, coln, i))
            {
                sudoku[row][coln] = i;
                if(sudokuSolver(sudoku, nextRow, nextColn))
                    return true;
                sudoku[row][coln] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][])
    {
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
            System.out.println("Solution Exist !\n");
            printSudoku(sudoku);
        }
        else
            System.out.println("Solution Does Not Exist !");
    }
}