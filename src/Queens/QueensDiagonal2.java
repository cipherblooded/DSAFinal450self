package Queens;

import java.util.Arrays;
import java.util.Scanner;

public class QueensDiagonal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean []arr = new boolean[2*n-1]; // total number of diagonal
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((n-1)-(j-i)+" ");
            }
            System.out.println();
        }
    }

}