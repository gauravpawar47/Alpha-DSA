package Programs.Chapter_36;

public class Ch36_5_Flood_Fill
{
    public static void helper(int[][] img, int sr, int sc, int color, boolean[][] visited, int orgColor)
    {
        if(sr < 0 || sc < 0 || sr >= img.length || sc >= img.length || visited[sr][sc] || img[sr][sc] != orgColor)
        {
            return;
        }

        helper(img, sr, sc - 1, color, visited, orgColor);
        helper(img, sr, sc + 1, color, visited, orgColor);
        helper(img, sr - 1, sc, color, visited, orgColor);
        helper(img, sr + 1, sc, color, visited, orgColor);
    }

    public static int[][] floodFill(int[][] img, int sr, int sc, int color)
    {
        boolean[][] visited = new boolean[img.length][img[0].length];
        helper(img, sr, sc, color, visited, img[sr][sc]);
        return img;
    }

    public static void main(String[] args)
    {

    }
}