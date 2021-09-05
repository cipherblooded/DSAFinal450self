package Temp;

import java.util.HashSet;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String s = scanner.next();
        HashSet<Character> consonant = new HashSet<>();
        HashSet<Character> vowel = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            char ch = (char) (97+i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel.add(ch);
                continue;
            }
            consonant.add(ch);
        }

        int i = 0;
        while (i < s.length()-2) {
            if(consonant.contains(s.charAt(i))&&vowel.contains(s.charAt(i+1))&&consonant.contains(s.charAt(i+2))){
                i=i+2;
            }else{
                System.out.println(i);
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
