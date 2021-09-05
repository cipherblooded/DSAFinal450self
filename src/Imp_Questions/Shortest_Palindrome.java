package Imp_Questions;

import java.util.Scanner;

public class Shortest_Palindrome {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String s = scanner.next();
        int x = 1;

        for (int i = s.length(); i>1; i--) {
            String s1 = s.substring(0,i);
            if(palindrome(s1)){
                x = s1.length();
                break;
            }
        }
        for (int i = s.length()-1; i >x-1; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.print(s);

    }

    private static boolean palindrome(String s1) {

//        System.out.println(s1);

        int left = 0;
        int right = s1.length()-1;

        while (left<right){
            if (s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
