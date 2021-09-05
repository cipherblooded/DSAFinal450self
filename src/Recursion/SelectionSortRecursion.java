package Recursion;
import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {

        int [] arr = {5,3,4,1,2};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length-1,0,1);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr, int n, int i, int j) {

        if(i==n){
            return;
        }
        if(arr[i]>arr[j]){
            swap(arr,i,j);
        }
        if(j==n){
            selectionSort(arr,n,i+1,i+2);
        }else {
            selectionSort(arr,n,i,j+1);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int t =arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
