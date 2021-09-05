package Imp_Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ReplaceHi {

    public static int count;
    public static ArrayList<String> arrayList;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashSet<String> hashSet = new HashSet<>();

        count = 0;
        arrayList = new ArrayList<>();

        subseq(s,"",0, hashSet);
        System.out.println(count);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

    private static void subseq(String s, String s1, int index, HashSet<String> hashSet) {

        if(index>s.length()){
            return;
        }
        if(index==s.length()){
            if(!hashSet.contains(s1)){
                hashSet.add(s1);
                arrayList.add(s1);
            }
            return;
        }
        if(index<s.length()-2&&s.substring(index,index+2).compareTo("hi")==0){
            count++;
            subseq(s,s1,index+2, hashSet);
            subseq(s,s1+"bye",index+2, hashSet);
        }else {
            subseq(s,s1+s.charAt(index),index+1, hashSet);
        }
    }
}
