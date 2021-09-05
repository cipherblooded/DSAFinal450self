package Imp_Questions;

import java.util.Scanner;

public class Lexicographical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        lexo(n,0);
    }

    private static void lexo(int n, int num) {
        if(num > n){
            return;
        }
        System.out.print(num+" ");
        int i;
        if(num==0){
            i = 1;
        }else {
            i = 0;
        }
        for (; i <= 9; i++) {
            lexo(n,num*10+i);
        }
    }
}
