package String.CustomSort;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SortString {
    public static HashSet<String> hashSet = new HashSet<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = "banana";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1 ; j++) {
                hashSet.add(s.substring(i,j));
            }
        }

        String []arr = new String[hashSet.size()];
        int k = 0;

        for (String temp:hashSet) {
            arr[k++] = temp;
        }

        sortFunc(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortFunc(String []arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (compareTo(arr[j], arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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
//            return 1; // for lexo
            return -1; // for batman -> bat

        } else {
//            return -1; // for lexo
            return 1; // for batman -> bat
        }

    }

}

