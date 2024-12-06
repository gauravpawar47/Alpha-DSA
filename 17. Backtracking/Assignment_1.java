public class Assignment_1 {
    public static int totalWays(int[][] maze, int i, int j, int n, boolean[][] visited) {
        // Step 1: Base-Case
        if (i == n - 1 && j == n - 1) {
            return 1;
        }
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        // Mark the cell as visited
        visited[i][j] = true;

        // Recursive calls for all four directions
        int up = totalWays(maze, i - 1, j, n, visited);
        int down = totalWays(maze, i + 1, j, n, visited);
        int left = totalWays(maze, i, j - 1, n, visited);
        int right = totalWays(maze, i, j + 1, n, visited);

        // Backtrack: Unmark the cell as visited
        visited[i][j] = false;

        return up + down + left + right;
    }

    public static void main(String[] args) {
        // Q 1. Rat In Maze
        int[][] maze = {
            {1, 1, 1, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 1},
            {1, 0, 1, 1}
        };

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        System.out.println("Total Ways: " + totalWays(maze, 0, 0, 4, visited));
    }
}
