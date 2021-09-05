package Imp_Questions;

import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = scanner.nextInt();
        int index = 0;
        int currentSum = 0;

        subset(arr, index, sum,currentSum, "", "");
    }

    private static void subset(int[] arr, int index, int sum, int currentSum, String s1, String s2) {
        if(currentSum==sum){
            System.out.println(s1+" "+s2);
        }
        if(index== arr.length){
            return;
        }

        subset(arr,index+1,sum,currentSum+arr[index], s1+arr[index]+" ",s2);
        subset(arr,index+1,sum,currentSum, s1, s2+arr[index]);
    }
}
