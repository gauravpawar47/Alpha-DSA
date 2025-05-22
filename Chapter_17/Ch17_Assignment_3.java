package Programs.Chapter_17;

public class Ch17_Assignment_3
{
    static int N = 8;

    public static boolean isSafe(int x, int y, int sol[][])
    {
        return (x >= 0 && x < N && y >= 0 && y < N &&  sol[x][y] == -1);
    }

    public static void printSolution(int sol[][])
    {
        for(int x = 0; x < N; x++)
        {
            for(int y = 0; y < N; y++)
            {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveKT()
    {
        int sol[][] = new int[N][N];
        for(int x = 0; x < N; x++)
        {
            for(int y = 0; y < N; y++)
            {
                sol[x][y] = -1;
            }
        }

        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        sol[0][0] = 0;

        if(!solveKTUtil(0, 0, 1, sol, xMove, yMove))
        {
            System.out.println("Solution Does Not Exist");
            return false;
        }
        else
            printSolution(sol);

        return true;
    }

    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[])
    {
        int k;
        int nextX;
        int nextY;

        if(movei == N * N)
            return true;

        for(k = 0; k < 8; k++)
        {
            nextX = x + xMove[k];
            nextY = y + yMove[k];

            if(isSafe(nextX, nextY, sol))
            {
                sol[nextX][nextY] = movei;
                if(solveKTUtil(nextX, nextY, movei + 1, sol, xMove, yMove))
                    return true;
                else
                    sol[nextX][nextY] = -1;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        solveKT();
    }
}