import java.util.Arrays;

public class Practice_nQueens
{
    public static void nQueensAll(char[][] board, int row)
    {
        // Step 1 : Base-Case
        if(row == board.length)
        {
            printBoard(board);
            return;
        }

        // Step 2 : Kaam
        for(int j = 0; j < board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                
                // Step 3 : Inner Function Call
                nQueensAll(board, row + 1);
            
                // Step 4 : Backtrack Step
                board[row][j] = '-';
            }
        }
    }

    public static int count;
    public static void nQueensCount(char[][] board, int row)
    {
        // Step 1 : Base-Case
        if(row == board.length)
        {
            count++;
            return;
        }

        // Step 2 : Kaam
        for(int j = 0; j < board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                
                // Step 3 : Inner Function Call
                nQueensCount(board, row + 1);
            
                // Step 4 : Backtrack Step
                board[row][j] = '-';
            }
        }
    }

    public static boolean nQueensSolution(char[][] board, int row)
    {
        // Step 1 : Base-Case
        if(row == board.length)
        {
            return true;
        }

        // Step 2 : Kaam
        for(int j = 0; j < board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                
                // Step 3 : Inner Function Call
                if(nQueensSolution(board, row + 1))
                {
                    return true;
                }
            
                // Step 4 : Backtrack Step
                board[row][j] = '-';
            }
        }

        return false;
    }


    public static boolean isSafe(char[][] board, int row, int col)
    {
        // Case 1 : Vertically Up
        for(int i = row - 1; i >= 0; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // Case 2 : Diagonally Left
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        // Case 3 : Diagonally Right
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
    
        return true;
    }


    public static void printBoard(char[][] board)
    {
        System.out.println("------- CHESS BOARD -------");
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = 4;
        char[][] board = new char[n][n];

        for(int i = 0; i < board.length; i++)
        {
            Arrays.fill(board[i], '-');
        }

        nQueensAll(board, 0);
        nQueensCount(board, 0);
        System.out.println("Possible Solutions for placing "+ n +"-Queens : "+ count);

        if(nQueensSolution(board, 0))
        {
            System.out.println("Solution Exist for Placing "+ n +"-Queens");
            printBoard(board);
        }
        else
        {
            System.out.println("Solution Doesn't Exist for Placing "+ n +"-Queens");
        }

    }
}