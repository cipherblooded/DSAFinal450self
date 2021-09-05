package Dynamic_Programming.OneDimDP.Wines;

import java.util.Arrays;

public class WinesTopDown {
    public static void main(String[] args) {

        int []wines = {2, 3, 5, 1, 4}; // Greedy - 49 --> DP = 50 Rupees
        int year = 1;
        int [][]dp = new int[wines.length][wines.length];

        for (int i = 0; i < wines.length; i++) {
            for (int j = 0; j < wines.length; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = profitTopDown(wines,0,wines.length-1,year,dp);
        System.out.println(ans);
        System.out.println(Arrays.deepToString(dp));

    }

    private static int profitTopDown(int[] wines, int i, int j, int year, int [][]dp) {
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ans1 = wines[i]*year + profitTopDown(wines, i+1, j, year+1, dp);
        int ans2 = wines[j]*year + profitTopDown(wines, i, j-1, year+1, dp);
        
        dp[i][j] = Math.max(ans1,ans2);
        return dp[i][j];
    }
}

