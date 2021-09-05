package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SumItUp {

    private static HashSet<String> hashSet = new HashSet<>();
    private static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();

        Arrays.sort(arr);
        sumItUp(arr, sum, 0, "");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    private static void sumItUp(int[] arr, int sum, int i, String s) {
        if(sum==0){
            if(!hashSet.contains(s)){
                hashSet.add(s);
                arrayList.add(s);
            }
            return;
        }
        for (int j = i; j < arr.length; j++) {
            if(sum-arr[j]>=0) {
                sumItUp(arr, sum - arr[j], j+1, s+arr[j]+" ");
            }
        }
    }
}
