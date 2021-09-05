package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraySubarray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};

        printSubArray(arr);
        printSumOfSubArrays(arr);
        prefixSum(arr);

    }

    private static void prefixSum(int[] arr) {
        int []brr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            brr[i+1] = arr[i]+brr[i];
        }
        System.out.println(Arrays.toString(brr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.println(brr[j+1]-brr[i]);
            }
        }
    }

    private static void printSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k<=j ; k++) {
                    System.out.print(arr[k]+",");
                }
                System.out.println();
            }
        }
    }

    private static void printSumOfSubArrays(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum = sum+arr[j];
                System.out.println(sum);
            }
        }
    }


}
