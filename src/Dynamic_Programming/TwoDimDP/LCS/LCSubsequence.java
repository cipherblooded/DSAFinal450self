package Dynamic_Programming.TwoDimDP.LCS;

public class LCSubsequence {

    public static void main(String[] args) {

        String x="ATSCB";
        String y="VABZD";
        int m=x.length();
        int n=y.length();

        int result = lCSubsequence(x, y, m-1, n-1);
        System.out.println(result);
    }

    private static int lCSubsequence(String x, String y, int m, int n) {

        if(m==-1||n==-1){
            return 0;
        }

        if(x.charAt(m)==y.charAt(n)){
            return  1 + lCSubsequence(x, y, m-1, n-1); // skipping both the character
        }else {
            int a = lCSubsequence(x, y, m-1, n); // skipping character from m
            int b = lCSubsequence(x, y, m, n-1); // skipping character from n
            return Math.max(a, b);
        }
    }

}
