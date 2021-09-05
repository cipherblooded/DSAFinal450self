package Dynamic_Programming.OneDimDP.CoinChange;

import java.util.Arrays;

public class CoinChangeBottomUp {

    public static void main(String[] args) {

        int [] coins = {1,7,10};
        int amount = 15;
        int ans = coinChangeBottomUp(coins, amount);
        System.out.println(ans);

    }

    private static int coinChangeBottomUp(int[] coins, int amount) {

        int []dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for (int i = 1; i <=amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i-coins[j]>=0){
                    int subProblem = dp[i-coins[j]]+1;
                    dp[i] = Math.min(dp[i],subProblem);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }

}
