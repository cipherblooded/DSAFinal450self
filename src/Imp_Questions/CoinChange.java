package Imp_Questions;

import java.util.Scanner;

public class CoinChange {
    private static int count = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        coinChange(arr,0,sum,"");
        System.out.println(count);

    }

    private static void coinChange(int[] arr, int index, int sum, String s) {
        if(sum<0||index==arr.length){
            return;
        }
        if(sum==0){ // +ve base case
//            System.out.println(s);
            count++;
            return;
        }
        coinChange(arr,index,sum-arr[index], s+arr[index]);
        coinChange(arr,index+1,sum, s);
    }
}
