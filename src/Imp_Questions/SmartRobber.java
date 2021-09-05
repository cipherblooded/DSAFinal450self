package Imp_Questions;

import java.util.Scanner;

public class SmartRobber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n;
        int [] arr;
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            if(i==t-1){
                stringBuilder.append(maxAmount(arr,0,0));
            }else {
                stringBuilder.append(maxAmount(arr,0,0)).append("\n");
            }
        }
        System.out.println(stringBuilder);

    }

    private static int maxAmount(int[] arr, int index, int amount) {
        if(index>arr.length-1){
            return amount;
        }
        int max1 = maxAmount(arr,index+2,amount+arr[index]); // Selected the house
        int max2 = maxAmount(arr,index+1,amount); // Rejected the house
        return Math.max(max1,max2); // maximum from both
    }
}
