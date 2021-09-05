package Dynamic_Programming.OneDimDP.MinStepTo1;

public class MinStepTo1 {
    public static void main(String[] args) {

        int ans = minStepTo1(10);
        System.out.println(ans);

    }

    private static int minStepTo1(int n) {
        if(n==1){
            return 0;
        }
        int x = Integer.MAX_VALUE,y = Integer.MAX_VALUE,z = Integer.MAX_VALUE;

        if(n%3==0){
            x = minStepTo1(n/3);
        }if(n%2==0){
            y = minStepTo1(n/2);
        }
        z = minStepTo1(n-1);

        return Math.min(x,Math.min(y,z))+1;
    }
}
