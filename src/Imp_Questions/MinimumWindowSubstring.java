package Imp_Questions;

import java.util.Scanner;

// Sliding Window

public class MinimumWindowSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        solve(s1, s2);

    }

    public static void solve(String big, String small) {
        
        int[] small_arr = new int[255];
        for (int i = 0; i < small.length(); i++) {
            small_arr[small.charAt(i)]++; // Batua Number of char at i
        }

        int[] big_arr = new int[255];
        int start = 0;
        int end = 0;
        int score = 0;
        
        int ans_len = big.length();
        int ans_start = 0;
        int ans_end = 0;

        while (true) {

            if (score < small.length() && end < big.length()) {
                char end_char = big.charAt(end);
                if (big_arr[end_char] < small_arr[end_char]) {
                    score++;
                }
                big_arr[end_char]++;
                end++;

            } else if (score == small.length()) {

                // finding out the minimum window
                if (end - start < ans_len) {
                    ans_len = end - start;
                    ans_start = start;
                    ans_end = end;
                }

                char start_char = big.charAt(start);
                if (big_arr[start_char] == small_arr[start_char]) {
                    score--;
                }

                big_arr[start_char]--;
                start++;

            } else if (end == big.length()) {
                break;
            }
        }
        System.out.println(big.substring(ans_start,ans_end));
    }
}
