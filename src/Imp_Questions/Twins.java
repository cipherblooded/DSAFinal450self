package Imp_Questions;

import java.util.Scanner;

public class Twins {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean [] used = new boolean[s.length()];
        twins(s,used,0,"");
        System.out.println(count);
    }

    private static void twins(String s, boolean [] used, int index,String sn) {

        if(index>s.length()-1){
            return;
        }
        if(index+2<s.length()&&s.charAt(index)==s.charAt(index+2)){
            if(!used[index]){
                count++;
                used[index] = true;
                twins(s, used, index+2,sn+s.charAt(index));
            }
        }
        twins(s, used,index+1,sn);
    }

}
