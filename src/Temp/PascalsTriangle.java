package Temp;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPascalTriangle(n);
    }

    private static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {

                if(j==0||j==i){
                    System.out.println(" 1 ");
                }
                else {

                }

            }

        }
    }

}
