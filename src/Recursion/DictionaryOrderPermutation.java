package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DictionaryOrderPermutation {
    private static ArrayList<String> arrayList = new ArrayList<>();
    private static HashSet<String> hashSet = new HashSet<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int []arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        s = "";
        for (int i = 0; i < 26; i++) {
            while (arr[i]>0){
                s+=(char)(i+'a');
                arr[i]--;
            }
        }
        permutation(s,"");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)+" ");
        }
    }

    private static void permutation(String unprocessed, String processed) {
        if(unprocessed.isEmpty()){
            if(!hashSet.contains(processed)){
                hashSet.add(processed);
                arrayList.add(processed);
            }
            return;
        }
        for (int i = 0; i < unprocessed.length(); i++) {
            String rem1 = unprocessed.substring(0,i);
            char ch = unprocessed.charAt(i);
            String rem2 = unprocessed.substring(i+1);
            permutation(rem1+rem2,processed+ch);
        }
    }
}
