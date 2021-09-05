package Dynamic_Programming.TwoDimDP.CoinChange;

public class CoinChangeInfiniteMaze {

    public static void main(String[] args) {

        int []coins = {1,2,3};
        int sum = 4;
        int n = coins.length;
        int [][]dp = new int[sum+1][n]; // dp of sum will range from 0 to sum

        for (int i = 0; i < sum+1; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(coinChange(coins, n-1, sum, n, dp));

    }

    private static int coinChange(int[] coins, int index, int sum, int n, int[][] dp) {

        if(sum==0){
            return 1;
        }
        if(sum<0||index<0){
            return 0;
        }
        if(dp[sum][index]!=-1){
            return dp[sum][index];
        }
        int selected = coinChange(coins, index, sum-coins[index],n,dp);
        int rejected = coinChange(coins, index-1, sum,n,dp);
        dp[sum][index] = selected + rejected;
        return dp[sum][index];

    }
}

