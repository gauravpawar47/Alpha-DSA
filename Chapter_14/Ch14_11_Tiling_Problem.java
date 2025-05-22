package Programs.Chapter_14;

public class Ch14_11_Tiling_Problem
{
    public static int tilingProblem(int n)
    {
        if(n == 0 || n == 1)
            return 1;

        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 4;

        System.out.println("Total Ways to Plot 2 X 1 Tile on 2 X "+ n +" Board : "+ tilingProblem(n));
    }
}