package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortingForIntegerArray {
    public static void main(String[] args) {
        Integer [] arr = {5,4,1,3,2};
        Integer [] brr = {5,4,1,3,2};

        System.out.println("arr         "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted arr: "+Arrays.toString(arr));

        System.out.println("brr         "+Arrays.toString(brr));
        Arrays.sort(brr, Collections.reverseOrder());
        System.out.println("Sorted brr: "+Arrays.toString(brr));
    }
}
