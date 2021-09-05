package Dynamic_Programming.TwoDimDP.LCS;

public class LCSubsequence_TopDown {

    public static void main(String[] args) {

        String x="ATSCB";
        String y="VABZD";
        int m=x.length();
        int n=y.length();

        int [][]t = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                t[i][j]=-1;
            }
        }

        int result = lCSubsequence(x, y, m-1, n-1, t);
        System.out.println(result);
    }

    private static int lCSubsequence(String x, String y, int m, int n, int [][]t) {

        if(m==-1||n==-1){
            return 0;
        }
        // Memorization
        if(t[m][n]!=-1){
            return t[m][n];
        }

        if(x.charAt(m)==y.charAt(n)){
            t[m][n] = 1 + lCSubsequence(x, y, m-1, n-1, t); // skipping both the character
        }else {

            int a = lCSubsequence(x, y, m-1, n, t);// skipping character from m
            int b = lCSubsequence(x, y, m, n-1, t); // skipping character from n
            t[m][n] = Math.max(a, b);
        }
        return t[m][n];
    }

}
