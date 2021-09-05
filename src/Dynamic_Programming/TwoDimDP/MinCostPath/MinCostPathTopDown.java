package Dynamic_Programming.TwoDimDP.MinCostPath;

public class MinCostPathTopDown {

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int [][]maze = {{1, 2, 3},
                        {4, 8, 2},
                        {1, 5, 3}};

        int [][]dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(minCostPath(maze,0,0, m-1,n-1,dp));
    }

    private static int minCostPath(int[][] maze, int i, int j, int m, int n,int[][] dp) {

        if(i==m&&j==n){
            return maze[i][j];
        }
        if(i>m||j>n){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = minCostPath(maze, i, j+1, m, n, dp);
        int down = minCostPath(maze, i+1, j, m, n, dp);

        dp[i][j] = maze[i][j] + Math.min(right,down);
        return dp[i][j];

    }
}
