package Imp_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class LexoSubSequence {
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String []arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        for (int k = 0; k < n; k++) {
            arrayList.clear();
            subsuquence(arr[k],"");
            for (int i = 0; i < arrayList.size(); i++) {
                for (int j = 0; j < arrayList.size()-1; j++) {
                    if(compareTo(arrayList.get(j),arrayList.get(j+1))>0){
                        String temp = arrayList.get(j);
                        arrayList.set(j, arrayList.get(j+1));
                        arrayList.set(j+1,temp);
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }

    }

    private static int compareTo(String s1, String s2) {
        int i = 0;

        while (i<s1.length()&&i<s2.length()){
            if(s1.charAt(i)>s2.charAt(i)){
                return 1;
            }else if(s1.charAt(i)<s2.charAt(i)){
                return -1;
            }
            i++;
        }
        if(s1.length()>s2.length()){
            return 1;
        }else {
            return -1;
        }
    }

    private static void subsuquence(String unprocessed, String processed) {
        if(unprocessed.isEmpty()){
            arrayList.add(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        subsuquence(unprocessed,processed);
        subsuquence(unprocessed, processed+ch);
    }
}
