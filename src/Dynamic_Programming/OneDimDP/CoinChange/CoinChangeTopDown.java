package Dynamic_Programming.OneDimDP.CoinChange;

import java.util.Arrays;

public class CoinChangeTopDown {

    public static void main(String[] args) {

        int [] coins = {1,7,10};
        int amount = 15;
        int []dp = new int[amount+1];
        Arrays.fill(dp, -1);
        int ans = coinChangeTopDown(coins, amount, dp);
        System.out.println(Arrays.toString(dp));
        System.out.println(ans);

    }

    private static int coinChangeTopDown(int[] coins, int amount, int[] dp) {

        if(amount==0){
            return 0;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if(amount-coins[i]>=0) {
                int subProblem = coinChangeTopDown(coins, amount - coins[i], dp)+1;
                ans = Math.min(ans, subProblem);
            }
        }
        dp[amount] = ans;
        return dp[amount];
    }
}
