package Temp;
import java.util.Scanner;

public class threesumclosest {

    private static boolean flag = false;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.next();
        String s1 = scanner.next();

        if(s2.length()>s1.length()){
            System.out.println("NO");
            return;
        }else {
            stringMatching(s1,"",s2,0,0);
        }
        System.out.println(flag);

    }

    private static void stringMatching(String s1, String s, String s2, int i, int j) {
        if(i==s1.length()){
            if(s2.compareTo(s)==0){
                flag = true;
            }
            return;
        }
        if(j<s2.length()&&s1.charAt(i)==s2.charAt(j)){
            stringMatching(s1, s+s1.charAt(i), s2, i+1, j+1);
        }else {
            stringMatching(s1, s, s2, i+1, j);
        }
    }
}