package Recursion.Coins;

public class Case1_InfiniteNumberOfCoins {
    public static void main(String[] args) {

        int[] coins = { 2,3,5 };
		Coin_den_perm_wrt_U(coins, 10, "");
		System.out.println("-------------");
		Coin_den_comb_wrt_U(coins, 10, 0, "");
        System.out.println("-------------");
        Coin_den_comb_wrt_C(coins, 10, 0, "");

    }
    public static void Coin_den_perm_wrt_U(int[] coins, int Amount, String ans) {
        if (Amount < 0) {
            return;
        }
        if (Amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            Coin_den_perm_wrt_U(coins, Amount - coins[i], ans + coins[i]);
        }
    }

    public static void Coin_den_comb_wrt_U(int[] coins, int Amount, int prev_index, String ans) {
        if (Amount < 0) {
            return;
        }
        if (Amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = prev_index; i < coins.length; i++) {
            Coin_den_comb_wrt_U(coins, Amount - coins[i], i, ans + coins[i]);
        }
    }

    public static void Coin_den_comb_wrt_C(int[] coins, int Amount,int index_coin, String ans) {

        if(Amount<0 || index_coin==coins.length) {
            return;
        }

        if(Amount == 0) {
            System.out.println(ans);
            return;
        }


        Coin_den_comb_wrt_C(coins, Amount-coins[index_coin], index_coin, ans+coins[index_coin]); // Select
        Coin_den_comb_wrt_C(coins, Amount, index_coin+1, ans); //nahi select

    }
}
