package Imp_Questions;

import java.util.Scanner;

public class DuplicateCharacterFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = duplicateCharacterFormatting(s,"",0);
        System.out.println(ans);

    }

    private static String duplicateCharacterFormatting(String s, String ans, int index) {
        if(index==s.length()){
            return ans;
        }
        if(index<s.length()-1&&s.charAt(index)==s.charAt(index+1)){
            ans = duplicateCharacterFormatting(s, ans+s.charAt(index)+'*'+s.charAt(index+1), index+2);
        }else {
            ans =duplicateCharacterFormatting(s, ans+s.charAt(index), index+1);
        }
        return ans;
    }

}
