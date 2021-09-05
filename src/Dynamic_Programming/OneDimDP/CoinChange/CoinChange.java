package Dynamic_Programming.OneDimDP.CoinChange;

public class CoinChange {

    public static void main(String[] args) {

        int [] coins = {1,7,10};
        int amount = 15;

        System.out.println(coinChange(coins, amount));
        System.out.println(coinChange(coins, amount, coins.length-1));

    }

    // Min number of coins with respect to user
    private static int coinChange(int[] coins, int amount) {

        if(amount==0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if(amount-coins[i]>=0) {
                int subProblem = coinChange(coins, amount - coins[i])+1;
                ans = Math.min(ans, subProblem);
            }
        }
        return ans;
    }

    // Min Number of coins with respect to coin
    private static int coinChange(int[] coins, int amount, int index) {

        if(amount==0){
            return 0;
        }
        if(index==-1){
            return Integer.MAX_VALUE;
        }

        if(amount-coins[index]>=0){
            int selected = coinChange(coins,amount-coins[index], index)+1; // selected the coin
            int rejected = coinChange(coins,amount, index-1); // rejected the coin
            return Math.min(selected, rejected);
        }else{
            return coinChange(coins,amount, index-1);
        }
        
    }

}
