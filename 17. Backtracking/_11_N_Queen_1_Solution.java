import java.util.Arrays;

public class _11_N_Queen_1_Solution
{
    public static boolean nQueens(char[][] board, int row)
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
                if(nQueens(board, row + 1))
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
        // Vertically Up
        for(int i = row - 1; i >= 0; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // Left Diagonally
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        // Right Diagonally
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
        System.out.println("----- CHESS BOARD -----");
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++)
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

        for(int i = 0; i < n; i++)
        {
            Arrays.fill(board[i], '-');
        }

        if(nQueens(board, 0))
        {
            System.out.println("Solution is Possible For "+ n +"-Queens");
            printBoard(board);
        }
        else
        {
            System.out.println("Solution is Not Possible For "+ n +"-Queens");
        }
    }
}