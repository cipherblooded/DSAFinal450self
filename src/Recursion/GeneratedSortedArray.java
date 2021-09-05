package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class GeneratedSortedArray {
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a_length = scanner.nextInt();
        int b_length = scanner.nextInt();
        int [] arr = new int[a_length];
        int [] brr = new int[b_length];

        for (int i = 0; i < a_length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < b_length; i++) {
            brr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        HashSet<String> hashSet = new HashSet<>();
        generatedSortedArray(arr,brr, 0, 0, 'B',0 ,"",hashSet);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

    private static void generatedSortedArray(int[] arr, int[] brr, int ai, int bi, char selected,int val, String ans, HashSet<String> hashSet) {

        if(ai==arr.length||bi==brr.length){
            return;
        }

        if(selected=='B'){
            if(!hashSet.contains(ans)&&!ans.isEmpty()){
                arrayList.add(ans);
                hashSet.add(ans);
            }
            if(arr[ai]>val){
                generatedSortedArray(arr,brr,ai,bi,'A', arr[ai], ans+arr[ai]+' ', hashSet);
                generatedSortedArray(arr,brr,ai+1,bi,'B', val, ans, hashSet);

            }else {
                generatedSortedArray(arr,brr,ai+1,bi,'B',val, ans, hashSet);
            }
        }else {
            if(brr[bi]>val){
                generatedSortedArray(arr,brr,ai,bi,'B', brr[bi], ans+brr[bi]+' ', hashSet);
                generatedSortedArray(arr,brr,ai,bi+1,'A', val, ans, hashSet);
            }else {
                generatedSortedArray(arr,brr,ai,bi+1,'A',val, ans, hashSet);
            }
        }
    }


}
