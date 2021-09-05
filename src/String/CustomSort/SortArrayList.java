package String.CustomSort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SortArrayList {
    public static HashSet<String> hashSet = new HashSet<>();
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = "banana";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1 ; j++) {
                String sub = s.substring(i,j);
                if(!hashSet.contains(sub)){
                    hashSet.add(sub);
                    arrayList.add(sub);
                }
            }
        }

        sortFunc(arrayList);
//        Collections.sort(arrayList);
        System.out.println(arrayList);

    }

    public static void sortFunc(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (compareTo(arrayList.get(j), arrayList.get(j+1)) > 0) {
                    String temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1)) ;
                    arrayList.set(j+1, temp);
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

