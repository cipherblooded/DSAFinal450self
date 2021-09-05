package Recursion.Coins;

public class Case2_FiniteNumberOfCoins {

    public static void main(String[] args) {

		int[] coins = { 2, 2, 2, 3, 4, 4};
		Coin2_den_comb_wrt_U_1(coins, 6, -1, "");
        System.out.println("--------");
        Coin2_den_comb_wrt_U_2(coins, 6, 0, "");
        System.out.println("--------");
		Coin2_den_comb_wrt_C(coins, 6, 0, "");
		System.out.println("--------");
		Coin3_den_comb_wrt_U(coins, 6, 0, "");
		System.out.println("--------");
		Coin3_den_comb_wrt_C(coins, 6, 0, "",true);

    }

    // coins are finite
    public static void Coin2_den_comb_wrt_U_1(int[] coins, int Amount, int prev_index, String ans) {
        if (Amount < 0) {
            return;
        }
        if (Amount == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = prev_index + 1; i < coins.length; i++) {
            Coin2_den_comb_wrt_U_1(coins, Amount - coins[i], i, ans + coins[i]);
        }
    }

    public static void Coin2_den_comb_wrt_U_2(int[] coins, int Amount, int prev_index, String ans) {
        if (Amount < 0) {
            return;
        }
        if (Amount == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = prev_index ; i < coins.length; i++) {
            Coin2_den_comb_wrt_U_2(coins, Amount - coins[i], i+1, ans + coins[i]);
        }
    }

    public static void Coin2_den_comb_wrt_C(int[] coins, int Amount, int index_coin, String ans) {

        if (Amount < 0 || index_coin == coins.length) {
            return;
        }

        if (Amount == 0) {
            System.out.println(ans);
            return;
        }
        Coin2_den_comb_wrt_C(coins, Amount - coins[index_coin], index_coin + 1, ans + coins[index_coin]); // Select
        Coin2_den_comb_wrt_C(coins, Amount, index_coin + 1, ans); // nahi select
    }

    // Finite, Unique Solution

    public static void Coin3_den_comb_wrt_U(int[] coins, int Amount, int prev_index, String ans) {
        if (Amount < 0) {
            return;
        }
        if (Amount == 0) {
            System.out.println(ans);
            return;
        }
//		System.out.println(ans);
        for (int i = prev_index; i < coins.length; i++) {
            if (i > prev_index && coins[i] == coins[i - 1]) {
                continue;
            }
            Coin3_den_comb_wrt_U(coins, Amount - coins[i], i + 1, ans + coins[i]);
        }
    }

    public static void Coin3_den_comb_wrt_C(int[] coins, int Amount, int index_coin, String ans, boolean flag) {

        if (Amount < 0 || index_coin == coins.length) {
            return;
        }

        if (Amount == 0) {
            System.out.println(ans);
            return;
        }
//		if(prev coin is not selected and its the same as current coin ) {
//			Unselect my current coin;
//		}
        if (!flag && coins[index_coin] == coins[index_coin - 1]) {
            Coin3_den_comb_wrt_C(coins, Amount, index_coin + 1, ans, false); // nahi select
            return;
        }
        Coin3_den_comb_wrt_C(coins, Amount - coins[index_coin], index_coin + 1, ans + coins[index_coin], true); // Select
        Coin3_den_comb_wrt_C(coins, Amount, index_coin + 1, ans, false); // nahi select
    }
}
