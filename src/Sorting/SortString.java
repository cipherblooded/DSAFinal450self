package Sorting;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String []arr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.next();
//        }

        String []arr = new String[]{"batman" , "apple", "bat"};
        System.out.println("unsorted arr : "+Arrays.toString(arr));
        String []brr = Arrays.copyOf(arr,arr.length);
        int n = arr.length;
        sortfunc(arr,n);
        Arrays.sort(brr);
        System.out.println("lexo sorted arr : "+Arrays.toString(arr));
        System.out.println("sorted brr : "+Arrays.toString(brr));
    }
    public static int compareTo(String s1, String s2) {

        int i = 0;

        while (i < s1.length() && i < s2.length()) {

            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
            i++;
        }

        if (s1.length() > s2.length()) {
            return -1;
        } else {
            return 1;
        }

    }

    public static void sortfunc(String []arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareTo(arr[j], arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
