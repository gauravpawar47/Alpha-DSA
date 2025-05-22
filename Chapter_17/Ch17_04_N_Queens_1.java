package Programs.Chapter_17;

public class Ch17_04_N_Queens_1
{
    public static void printBoard(char board[][])
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

    public static boolean isSafe(char board[][], int row, int coln)
    {
        // vertically up
        for(int i = row - 1; i >= 0; i--)
        {
            if(board[i][coln] == 'Q')
                return false;
        }

        // diagonally left up
        for(int i = row - 1, j = coln - 1; i >= 0 && j >= 0; i--, j--)
        {
            if(board[i][j] == 'Q')
                return false;
        }

        // diagonally right up
        for(int i = row - 1, j = coln + 1; i >= 0 && j < board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void nQueens(char board[][], int row)
    {
        // basecase
        if(row == board.length)
        {
            printBoard(board);
            return;
        }

        // work done
        for(int j = 0; j < board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // recursion call
                board[row][j] = 'X'; // backtrack call
            }
        }
    }

    public static void main(String[] args)
    {
        int n = 4;
        char board[][] = new char[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
    }
}