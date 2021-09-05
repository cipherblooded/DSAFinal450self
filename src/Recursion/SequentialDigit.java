package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SequentialDigit {

    public static ArrayList <Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        sequentialDigit(low, high, 0);
        System.out.println(arrayList);
    }

    private static void sequentialDigit(int low, int high, int ans) {

        if(ans>=low&&ans<=high){
            arrayList.add(ans);
            return;
        }
        int i = 0;
        if(ans==0){
            i = 1;
        }
        for (; i <= 9; i++) {
            sequentialDigit(low, high, ans*10+i);
        }
    }
}
