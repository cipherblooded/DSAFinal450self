package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortingForStringArray {
    public static void main(String[] args) {

        String []arr = {"a", "ab", " ", "xyz", "b", "z", "bc"};
        String []brr = {" ", "a", "ab", "xyz", "b", "z", "bc"};

        System.out.println("arr         "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted arr: "+Arrays.toString(arr));

        System.out.println("brr         "+Arrays.toString(brr));
        Arrays.sort(brr, Collections.reverseOrder());
        System.out.println("Sorted brr: "+Arrays.toString(brr));

    }
}
