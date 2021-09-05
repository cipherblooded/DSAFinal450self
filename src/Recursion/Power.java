package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int ans = power(2,10);
        System.out.println(ans);
    }

    private static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int xToThePowerNBy2 = power(x,n/2);
        if(n%2==0){
            xToThePowerNBy2 = xToThePowerNBy2*xToThePowerNBy2;
        }else {
            xToThePowerNBy2 = xToThePowerNBy2*xToThePowerNBy2*x;
        }
        return xToThePowerNBy2;
    }
}
