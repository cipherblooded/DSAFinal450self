package Dynamic_Programming.OneDimDP.MinStepTo1;

import java.util.Arrays;

public class MinStepTo1BottomUp {
    public static void main(String[] args) {

        int n = 10;
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);

        int ans = minStepTo1BottomUp(10, dp);
        System.out.println(ans);
        System.out.println(Arrays.toString(dp));

    }

    private static int minStepTo1BottomUp(int n, int [] dp){

        dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            int x = Integer.MAX_VALUE,y = Integer.MAX_VALUE,z = Integer.MAX_VALUE;

            if(n%3==0){
                x = dp[i/3];
            }if(n%2==0){
                y = dp[i/2];
            }
            z=dp[i-1];
            dp[i] = Math.min(x,Math.min(y,z))+1;
        }
        return dp[n];
    }
}


