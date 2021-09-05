package Imp_Questions;

import java.util.Scanner;

public class Repeatedhi {
    public static int count;
    public static String ans1;
    public static String ans2;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        count = 0;
        ans1 = "";
        ans2 = "";

        replaceHi(s,"",0);
        replaceHiWithBye(s,"",0);

        System.out.println(count);
        System.out.println(ans1);
        System.out.println(ans2);

    }

    private static void replaceHi(String s, String ans, int i) {

        if(i>=s.length()){
            ans1 = ans;
            return;
        }
        if(i<s.length()-3&&s.charAt(i+2)!='t'&&s.substring(i,i+2).compareTo("hi")==0){
            count++;
            replaceHi(s, ans,i+2);
        }else {
            if(i==s.length()-2&&s.substring(i,i+2).compareTo("hi")==0){
                count++;
                replaceHi(s,ans,i+2);
            }else {
                replaceHi(s, ans+s.charAt(i),i+1);
            }
        }
    }

    private static void replaceHiWithBye(String s, String ans, int i) {

        if(i>=s.length()){
            ans2 = ans;
            return;
        }


        if(i<s.length()-3&&s.charAt(i+2)!='t'&&s.substring(i,i+2).compareTo("hi")==0){
            replaceHiWithBye(s, ans+"bye",i+2);
        } else {
            if(i==s.length()-2&&s.substring(i,i+2).compareTo("hi")==0){
                replaceHiWithBye(s,ans+"bye",i+2);
            }else {
                replaceHiWithBye(s, ans+s.charAt(i),i+1);
            }
        }

    }
}
