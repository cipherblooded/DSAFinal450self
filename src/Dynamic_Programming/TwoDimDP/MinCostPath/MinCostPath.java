package Dynamic_Programming.TwoDimDP.MinCostPath;

public class MinCostPath {
    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int [][]maze = {{1, 2, 3},
                        {4, 8, 2},
                        {1, 5, 3}};

        System.out.println(minCostPath(maze,0,0, m-1,n-1));
    }

    private static int minCostPath(int[][] maze, int i, int j, int m, int n) {

        if(i==m&&j==n){
            return maze[i][j];
        }
        if(i>m||j>n){
            return Integer.MAX_VALUE;
        }
        int right = minCostPath(maze, i, j+1, m, n);
        int down = minCostPath(maze, i+1, j, m, n);

        return maze[i][j] + Math.min(right,down);

    }
}

