package Imp_Questions;

import java.util.Scanner;

public class SubSet {
    public static int count = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();
        subsetprint(arr,0,sum,"");
        System.out.println();
        System.out.println(count);

    }

    private static void subsetprint(int[] arr, int i, int sum,  String s) {

        if(sum==0){
            count++;
            System.out.print(s+" ");
            return;
        }

        if(sum<0||i>=arr.length){
            return;
        }

        subsetprint(arr,i+1,sum-arr[i],s+arr[i]+" ");
        subsetprint(arr,i+1,sum,s);
    }
}
