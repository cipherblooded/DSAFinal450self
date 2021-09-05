package Dynamic_Programming.OneDimDP.Wines;

public class Wines {
    public static void main(String[] args) {

        int []wines = {2, 3, 5, 1, 4}; // Greedy - 49 --> DP = 50 Rupees
        int year = 1;

        int ans = profit(wines,0,wines.length-1,year);
        System.out.println(ans);

    }

    private static int profit(int[] wines, int i, int j, int year) {
        if(i>j){
            return 0;
        }
        int ans1 = wines[i]*year + profit(wines, i+1, j, year+1);
        int ans2 = wines[j]*year + profit(wines, i, j-1, year+1);
        return Math.max(ans1,ans2);
    }
}
