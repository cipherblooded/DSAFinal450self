package Imp_Questions;

import java.util.Scanner;

public class Ladder {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ladder(arr,k,0,"");
        System.out.println(count);

    }

    private static void ladder(int[] arr,int k, int i, String s) {
        if(i==arr.length){
//            System.out.println(s);
            count++;
            return;
        }

        if(i>arr.length){
            return;
        }

        if(arr[i]==1){
            return;
        }
        for (int j = 1; j <= k; j++) {
            ladder(arr,k,i+j,s+(i+1));
        }
    }
}
