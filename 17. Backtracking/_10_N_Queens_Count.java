import java.util.Arrays;

public class _10_N_Queens_Count
{
    public static int count;
    public static void nQueens(char[][] board, int row)
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
                nQueens(board, row + 1);
                board[row][j] = '-';
            }
        }
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

        // Diagonally Left
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        // Diagonally Right
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args)
    {
        int n = 4;
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++)
        {
            Arrays.fill(board[i], '-');
        }

        nQueens(board, 0);
        System.out.println("Total Ways to Solve "+ n +"-Queens : "+ count);
    }
}