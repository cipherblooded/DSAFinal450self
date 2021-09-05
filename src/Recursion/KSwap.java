package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KSwap {
    private static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        arrayList.add(s);
        char []arr = s.toCharArray();
        int k = scanner.nextInt();
        kSwap(arr, k);
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size()-1));
    }

    private static void kSwap(char []arr, int k) {
        if(k==0){
            arrayList.add(String.valueOf(arr));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    swap(arr, i, j);
                    kSwap(arr,k-1);
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
