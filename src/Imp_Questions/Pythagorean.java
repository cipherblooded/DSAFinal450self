package Imp_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Pythagorean {
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        long []arr =new long[t];

        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < t; i++) {

            arrayList.clear();
            pythagorean(arr[i],0,0,2,"");

            for (int j = 0; j < arrayList.size(); j++) {
                System.out.print(arrayList.get(j)+" ");
            }
            if(i!=t-1){
                System.out.println();
            }
        }

    }

    private static void pythagorean(long n, long i, long sum, int count, String s) {

        if(sum==n&&count==0){
            arrayList.add("("+s.substring(0,s.length()-1)+")");
            return;
        }

        if(sum>n||count<0){
            return;
        }

        for (long j = i; j <= (long) Math.sqrt(n); j++) {
            pythagorean(n, j+1, sum+(j*j), count-1, s+j+",");
        }
    }
}
