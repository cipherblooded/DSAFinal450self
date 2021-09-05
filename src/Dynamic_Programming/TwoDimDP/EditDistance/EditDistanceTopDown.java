package Dynamic_Programming.TwoDimDP.EditDistance;
import java.util.Scanner;

public class EditDistanceTopDown {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String from = scanner.next();
        String to = scanner.next();

        int[][] dp = new int[from.length()][to.length()];

        for (int i = 0; i < from.length(); i++) {
            for (int j = 0; j < to.length(); j++) {
                dp[i][j]=-1;
            }
        }

        int minStep = editDistanceTopDown(from, to, from.length()-1,to.length()-1,dp);
        System.out.println(minStep);

    }

    private static int editDistanceTopDown(String from, String to, int fromIndex, int toIndex, int [][]dp) {

        if(fromIndex==-1){
            return toIndex+1;
        }if(toIndex==-1){
            return fromIndex+1;
        }
        if(dp[fromIndex][toIndex]!=-1){
            return dp[fromIndex][toIndex];
        }
        if(from.charAt(fromIndex)==to.charAt(toIndex)){
            dp[fromIndex][toIndex] = editDistanceTopDown(from, to, fromIndex-1, toIndex-1, dp);
        }else {
            int a = editDistanceTopDown(from, to, fromIndex - 1, toIndex, dp);
            int b = editDistanceTopDown(from, to, fromIndex, toIndex - 1, dp);
            int c = editDistanceTopDown(from, to, fromIndex - 1, toIndex - 1, dp);
            dp[fromIndex][toIndex] = Math.min(a, Math.min(b, c)) + 1;
        }
        return dp[fromIndex][toIndex];
    }
}

