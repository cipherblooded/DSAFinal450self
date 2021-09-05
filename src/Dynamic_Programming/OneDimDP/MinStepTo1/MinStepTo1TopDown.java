package Dynamic_Programming.OneDimDP.MinStepTo1;

import java.util.Arrays;

public class MinStepTo1TopDown {

    public static void main(String[] args) {

        int n = 10;
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);

        int ans = minStepTo1TopDown(10, dp);
        System.out.println(ans);
        System.out.println(Arrays.toString(dp));

    }

    private static int minStepTo1TopDown(int n, int [] dp){

        if(n==1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        int x = Integer.MAX_VALUE,y = Integer.MAX_VALUE,z = Integer.MAX_VALUE;

        if(n%3==0){
            x = minStepTo1TopDown(n/3, dp);
        }if(n%2==0){
            y = minStepTo1TopDown(n/2, dp);
        }
        z = minStepTo1TopDown(n-1, dp);

        dp[n] = Math.min(x,Math.min(y,z))+1;
        return dp[n];
    }
}

