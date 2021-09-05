package Imp_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitArray {
    private static int count = 0;
    private static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        int equalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            equalSum = equalSum+arr[i];
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(equalSum);


        splitArray(arr,0,"","",equalSum/2,0);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(count);

    }

    private static void splitArray(int[] arr, int i, String s1, String s2,int equalSum, int currentSum) {

        if(i==arr.length){
            if(currentSum==equalSum){
                arrayList.add(s1+"and "+s2);
                count++;
            }
            return;
        }
        splitArray(arr,i+1,s1+arr[i]+" ",s2,equalSum,currentSum+arr[i]);
        splitArray(arr,i+1,s1,s2+arr[i]+" ",equalSum,currentSum);

    }
}
