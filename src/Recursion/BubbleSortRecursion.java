package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {

        int []arr = {5,3,4,1,2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arr.length,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr, int n, int i, int j) {
        if(i==0){
            return;
        }
        if(arr[j]>arr[j+1]){
            swap(arr,j,j+1);
        }
        if(j==i-1){
            bubbleSort(arr,n,i-1,0);
        }else {
            bubbleSort(arr,n,i,j+1);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
